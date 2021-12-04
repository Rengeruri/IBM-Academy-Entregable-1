package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.enums.Pizarron;
import com.ibm.academia.apirest.enums.TipoEmpleado;

@Component
public class Comandos implements CommandLineRunner{
	
	@Autowired
	private ProfesorDAO profesorDao;
	
	@Autowired
	private EmpleadoDAO empleadoDao;
	
	@Autowired
	private CarreraDAO carreraDao;
	
	@Autowired
	private AulaDAO aulaDao;
	
	@Autowired
	private PabellonDAO pabellonDao;
	
	@Override
	public void run(String... args) throws Exception {
		//ProfesorRepository: 
		//Punto 1
		Iterable<Persona> profesores = profesorDao.findProfesoresByCarrera("Ingenieria en Sistemas");
		profesores.forEach(System.out::println); 
		
		//EmpleadoRepository:
		//Punto 1
		Iterable<Persona> empleados = empleadoDao.findEmpleadoByTipoEmpleado(TipoEmpleado.ADMINISTRATIVO);
		empleados.forEach(System.out::println);
		
		//CarreraRepository:
		//Punto 1
		Iterable<Carrera> carreras = carreraDao.buscarCarrerasPorProfesorNombreYApellido("Steve", "Jobs");
		carreras.forEach(System.out::println);
		
		
		//A partir de aquí, los métodos ya no llevan la notación @Query
		//AulaRepository:
		//Punto 1
		Iterable<Aula> aulasPizarron = aulaDao.findByPizzaron(Pizarron.PIZARRA_BLANCA);
		aulasPizarron.forEach(System.out::println);
		//Punto 2
		Iterable<Aula> aulasPabellon = aulaDao.findByPabellonNombre("Pabellon 1");
		aulasPabellon.forEach(System.out::println);
		//Punto 3
		Optional<Aula> aulaNumero = aulaDao.findByNumeroAula(2);
		System.out.println(aulaNumero.toString());
		
		//PabellonRepository
		//Punto 1
		Iterable<Pabellon> pabellones = pabellonDao.findByDireccionLocalidad("CDMX");
		pabellones.forEach(System.out::println);
		//Punto 2
		Optional<Pabellon> pabellon = pabellonDao.findByNombre("Pabellon 2");
		System.out.println(pabellon.toString());
		
		
	}

}
