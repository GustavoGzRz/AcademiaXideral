package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Cliente;
import com.javatechie.spring.batch.repository.ClienteRepository;

import lombok.AllArgsConstructor;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;

@Configuration
@EnableBatchProcessing
@AllArgsConstructor
public class SpringBatchConfig {

    private JobBuilderFactory jobBuilderFactory;
    private StepBuilderFactory stepBuilderFactory;
    private ClienteRepository clienteRepository;

    //READER\\
	@Bean
    public FlatFileItemReader<Cliente> reader() { //Lee el documento
        FlatFileItemReader<Cliente> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/clientes.csv")); //busca el archivo separado por comas (CSV)
        itemReader.setName("csvReader"); //En este caso solo lee un CSV
        itemReader.setLinesToSkip(1); //Salta la primer linea de encabezados
        itemReader.setLineMapper(lineMapper());//¿Como lo maapeo? L-44
        return itemReader;
    }

	//ENTRADA\\ [Pueden se diferentes tipos de formatos]
				//https://docs.spring.io/spring-batch/docs/current/reference/html/appendix.html#listOfReadersAndWriters
    private LineMapper<Cliente> lineMapper() { //Especifica como delimitar
        DefaultLineMapper<Cliente> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(","); //Delimita por comas
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("id", "nombre", "apellido", "correo", "genero", "contacto", "pais", "fdn");

        BeanWrapperFieldSetMapper<Cliente> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Cliente.class);

        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;

    }
    
    //PROCESSOR\\ [Es opcional] Si o si, lleva entrada y salida
    @Bean
    public ClienteProcessor processor() {
        return new ClienteProcessor();
    }

    //Writer\\ SALIDA [Realiza los INSERT]
    @Bean
    public RepositoryItemWriter<Cliente> writer() {
        RepositoryItemWriter<Cliente> writer = new RepositoryItemWriter<>();
        writer.setRepository(clienteRepository);
        writer.setMethodName("save");
        return writer;
    }

    //STEP\\ **Revisar patron builder
    @Bean
    public Step step1() {
        return stepBuilderFactory.get("csv-step").<Cliente, Cliente>chunk(10) //Proceso de 10 en 10
                //Pasos a seguir
        		.reader(reader()) 				//lee
                .processor(processor())			//procesa
                .writer(writer())				//escribe
                .taskExecutor(taskExecutor())	//ejecuta
                .build();						//construye
    }
    //STEP1 **Puede tener muchos [Tiene entrada, procesamiento y salida]
    @Bean
    public Job runJob() {
        return jobBuilderFactory.get("importClientes")
                .flow(step1()).end().build();
        					//end() indica fin de este paso

    }

    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(10);
        return asyncTaskExecutor;
    }

}

/*Spring Batch crea la tabla
 * JOB REPOSITORY: Son las tablas creadas
 * LAUNCHER: Se dispara por el servicio REST
 * SALIDA: Que se cargue a la base de datos*/
