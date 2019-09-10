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

import com.sembenavente.demo.entity.Autor;
import com.sembenavente.demo.service.IAutorService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/autores")
public class AutorController {
	
	@Autowired
	private IAutorService autorService;
	
	@GetMapping("/")
	public List<Map<String,Object>> getAutores(){
		return autorService.readAll();
	}
	@PostMapping("/add")
	public int createAutor(@RequestBody Autor autor) {
		return autorService.create(autor);
	}
	@DeleteMapping("/{id}")
	public int deleteAutor(@PathVariable int id) {
		return autorService.delete(id);
	}
	@GetMapping("/{id}")
	public Autor getAutorId(@PathVariable int id) {
		return autorService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Autor l, @PathVariable int id) {
		l.setIdautor(id);
		return autorService.update(l);
	}
	
}
