package com.mtec.persona.dao;

import org.springframework.data.repository.CrudRepository;

import com.mtec.persona.dominio.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{

}
