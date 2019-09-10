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

import com.sembenavente.demo.entity.Detalle;
import com.sembenavente.demo.service.IDetalleService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/detalles")
public class DetalleController {

	@Autowired
	private IDetalleService detalleService;
	
	@GetMapping("/")
	public List<Map<String,Object>> getDetalles(){
		return detalleService.readAll();
	}
	@PostMapping("/add")
	public int createDetalle(@RequestBody Detalle libro) {
		return detalleService.create(libro);
	}
	@DeleteMapping("/{id}")
	public int deleteDetalle(@PathVariable int id) {
		return detalleService.delete(id);
	}
	@GetMapping("/{id}")
	public Detalle getDetalleId(@PathVariable int id) {
		return detalleService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Detalle l, @PathVariable int id) {
		l.setIddetalle(id);
		return detalleService.update(l);
	}
	
}
