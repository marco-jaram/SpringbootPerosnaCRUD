package com.mtec.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.persona.dao.PersonaDao;
import com.mtec.persona.dominio.Persona;
import com.mtec.persona.web.PersonaController;

import jakarta.transaction.Transactional;

@Service
public class PersonaSrviceImpl implements PersonaService {
	@Autowired
	private PersonaDao personaDao;

	@Override
	@Transactional
	public List<Persona> listarPersonas() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Persona persona) {
		personaDao.save(persona);

	}

	@Override
	@Transactional
	public void eliminar(Persona persona) {
		personaDao.delete(persona);

	}

	@Override
	@Transactional
	public Persona encontrarPersona(Persona persona) {
		return personaDao.findById(persona.getId()).orElse(null);
	}

}
