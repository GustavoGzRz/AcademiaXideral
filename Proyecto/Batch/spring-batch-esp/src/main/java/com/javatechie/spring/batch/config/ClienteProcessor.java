package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Cliente;
import org.springframework.batch.item.ItemProcessor;

public class ClienteProcessor implements ItemProcessor<Cliente,Cliente> {

    @Override
    public Cliente process(Cliente cliente) throws Exception {
    	
    	//Aqui se describe el proceso que se desea emplear
    	
        /*if(cliente.getCountry().equals("China")) {
            return cliente;
        }
        return null;*/
        return cliente;
    }
}
