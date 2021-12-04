package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.repositories.CarreraRepository;

@Service
public class CarreraDAOImp extends GenericoDAOImp<Carrera, CarreraRepository> implements CarreraDAO{
	
	@Autowired
	public CarreraDAOImp(CarreraRepository repository) {
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findByCantidadAnios(Integer cantidadAnios) {
		return repository.findByCantidadAnios(cantidadAnios);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre) {
		return repository.findCarrerasByNombreContains(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) {
		return repository.findCarrerasByNombreContainsIgnoreCase(nombre);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios) {
		return repository.findCarrerasByCantidadAniosAfter(cantidadAnios);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido) {
		return repository.buscarCarrerasPorProfesorNombreYApellido(nombre, apellido);
	}
}
