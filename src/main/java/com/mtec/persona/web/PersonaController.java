package com.mtec.persona.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mtec.persona.dominio.Persona;
import com.mtec.persona.service.PersonaService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var personas = personaService.listarPersonas();
		
		model.addAttribute("personas", personas);
		return "index";

	}
	@GetMapping("/agregar")
	public String agregar (Persona persona) {
		return "modificar";
	}
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		personaService.guardar(persona);
		return "redirect:/";
		
	}
	 @GetMapping("/editar/{id}")
	    public String editar(Persona persona, Model model) {
	        persona = personaService.encontrarPersona(persona);
	        model.addAttribute("persona", persona);
	        return "modificar";
	    }

	    @GetMapping("/eliminar")
	    public String eliminar(Persona persona) {
	        personaService.eliminar(persona);
	        return "redirect:/";
	    }



	
}
