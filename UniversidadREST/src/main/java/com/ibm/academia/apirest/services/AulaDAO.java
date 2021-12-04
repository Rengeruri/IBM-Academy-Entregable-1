package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.enums.Pizarron;

public interface AulaDAO extends GenericoDAO<Aula>{
	
	public Iterable<Aula> findByPizzaron(Pizarron pizzaron);
	public Iterable<Aula> findByPabellonNombre(String nombrePabellon);
	public Optional<Aula> findByNumeroAula(Integer numeroAula);
	
}
