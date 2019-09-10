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


import com.sembenavente.demo.entity.Prestamo;
import com.sembenavente.demo.service.IPrestamoService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

	@Autowired
	private IPrestamoService prestamoService;
	
	@GetMapping("/")
	public List<Map<String,Object>> getPrestamos(){
		return prestamoService.readAll();
	}
	@PostMapping("/add")
	public int createPrestamo(@RequestBody Prestamo prestamo) {
		return prestamoService.create(prestamo);
	}
	@DeleteMapping("/{id}")
	public int deletePrestamo(@PathVariable int id) {
		return prestamoService.delete(id);
	}
	@GetMapping("/{id}")
	public Prestamo getPrestamoId(@PathVariable int id) {
		return prestamoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Prestamo l, @PathVariable int id) {
		l.setIdprestamo(id);
		return prestamoService.update(l);
	}
	
}
