package com.springboot.wiki.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.springboot.wiki.entity.Personaje;
import com.springboot.wiki.service.PersonajeService;

@Controller
@RequestMapping("/list")
public class PersonajeMvcController {

	// need to inject our personaje service
	@Autowired
	private PersonajeService personajeService;
	
	@GetMapping("/personajes")
	public String listPersonajes(Model theModel) {
		
		// get personajes from the service
		List<Personaje> thePersonajes = personajeService.findAll();
				
		// add the personajes to the model
		theModel.addAttribute("personajes", thePersonajes);
		
		return "list-personajes";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Personaje thePersonaje = new Personaje();
		
		theModel.addAttribute("personaje", thePersonaje);
		
		return "personaje-form";
	}
	
	@PostMapping("/savePersonaje")
	public String savePersonaje(@ModelAttribute("personaje") Personaje thePersonaje) {
		
		// save the personaje using our service
		personajeService.save(thePersonaje);	
		
		return "redirect:/mvc/personajes";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("personajeId") int theId,
									Model theModel) {
		
		// get the personaje from our service
		Personaje thePersonaje = personajeService.findById(theId);	
		
		// set personaje as a model attribute to pre-populate the form
		theModel.addAttribute("personaje", thePersonaje);
		
		// send over to our form		
		return "personaje-form";
	}
	
	@GetMapping("/delete")
	public String deletePersonaje(@RequestParam("personajeId") int theId) {
		
		// delete the personaje
		personajeService.deleteById(theId);
		
		return "redirect:/mvc/personajes";
	}

}










