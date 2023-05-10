package com.mtec.persona.service;

import java.util.List;

import com.mtec.persona.dominio.Persona;

public interface PersonaService {
public List<Persona> listarPersonas();
public void guardar(Persona persona);
public void eliminar (Persona persona);
public Persona encontrarPersona(Persona persona);

	
}
