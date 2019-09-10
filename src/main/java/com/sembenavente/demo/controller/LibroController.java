package com.sembenavente.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sembenavente.demo.entity.Libro;
import com.sembenavente.demo.service.ILibroService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/libros")
public class LibroController {
	@Autowired
	private ILibroService libroService;
	
	@GetMapping("/")
	public List<Map<String,Object>> getLibros(){
		return libroService.readAll();
	}
	@PostMapping("/add")
	public int createLibro(@RequestBody Libro libro) {
		return libroService.create(libro);
	}
	@DeleteMapping("/{id}")
	public int deleteLibro(@PathVariable int id) {
		return libroService.delete(id);
	}
	@GetMapping("/{id}")
	public Libro getLibroId(@PathVariable int id) {
		return libroService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Libro l, @PathVariable int id) {
		l.setIdlibro(id);
		return libroService.update(l);
	}
	
	
	  
}
