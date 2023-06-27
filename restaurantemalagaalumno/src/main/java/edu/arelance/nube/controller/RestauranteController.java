package edu.arelance.nube.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arelance.nube.repository.entity.Restaurante;
import edu.arelance.nube.services.RestauranteService;

/**
 * 
 * API WEB 
 * HTTP -> Deriva en la ejecución de un método
 *
 *GET -> Consultar TODOS
 *GET -> Consultar Uno (por ID)
 *POST -> Insertat un restaurante nuevo
 *PUT -> Modificar un restaurante que ya existe
 *DELETE -> Borrar un restaurante (por ID)
 *GET -> Búsqueda -> por barrio, especialidad, nombre, etc
 */


//@Controller //devolvemos una vista html/jsp
@RestController //devolvemos solo texto JSON http://localhost:8081/restaurante
@RequestMapping ("/restaurante")

public class RestauranteController {
	
	@Autowired
	RestauranteService restauranteService;

	@GetMapping ("/test") //get http://localhost:8081/restaurante/test
	public Restaurante obtenerRestauranteTest () {
		
		Restaurante restaurante = null;
		System.out.println("llamando a obtenerRestauranteTest");
		restaurante = new Restaurante(1l, "Martinete", "Carlos Haya 33", "Carranque", "www.martinete.org", "http://google.xe", 33.65f, -2.3f, 10, "gazpachuelo", "paella", "sopa de marisco", LocalDateTime.now());
		return restaurante;
		}
	
	//GET -> Consultar TODOS GET http://localhost:8081/restaurante
	
	@GetMapping
	public ResponseEntity<?> listarTodos () {
		ResponseEntity<?> responseEntity =null;
		return responseEntity;
	}	
	//GET -> Consultar Uno (por ID) http://localhost:8081/restaurante/id
	
	@GetMapping("/{id}")
	public ResponseEntity<?> listarPorId (@PathVariable Long id) {
		ResponseEntity<?> responseEntity =null;
		return responseEntity;
		
		
	}
	
	//*POST -> Insertat un restaurante nuevo http://localhost:8081/restaurante (Body Restaurante)
	
	
	
	
	//*PUT -> Modificar un restaurante que ya existe http://localhost:8081/restaurante/id (Body Restaurante)
	
	//*DELETE -> Borrar un restaurante (por ID)   http://localhost:8081/restaurante/id
	
	@GetMapping("/{id}")
	public ResponseEntity<?> borrarPorId (@PathVariable Long id) {
		ResponseEntity<?> responseEntity =null;
		return responseEntity;
		
		
	}
	
	
}
