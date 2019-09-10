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

import com.sembenavente.demo.entity.Empleado;
import com.sembenavente.demo.service.IEmpleadoService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private IEmpleadoService empleadoService;
	
	@GetMapping("/")
	public List<Map<String,Object>> getEmpleados(){
		return empleadoService.readAll();
	}
	@PostMapping("/add")
	public int createEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.create(empleado);
	}
	@DeleteMapping("/{id}")
	public int deleteEmpleado(@PathVariable int id) {
		return empleadoService.delete(id);
	}
	@GetMapping("/{id}")
	public Empleado getEmpleadoId(@PathVariable int id) {
		return empleadoService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Empleado l, @PathVariable int id) {
		l.setIdempleado(id);
		return empleadoService.update(l);
	}
	@GetMapping("/login/")
	public int login(@RequestBody Empleado l) {
		System.out.println(l.getCorreo() + " " + l.getClave());
		return empleadoService.login(l.getCorreo(), l.getClave());
	}
	
}
