package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.entities.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>{

	public Iterable<Pabellon> findByDireccionLocalidad(String nombre);
	
	public Optional<Pabellon> findByNombre(String nombre);
	
}
