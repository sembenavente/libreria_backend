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

import com.sembenavente.demo.entity.Cliente;
import com.sembenavente.demo.service.IClienteService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/")
	public List<Map<String,Object>> getClientes(){
		return clienteService.readAll();
	}
	@PostMapping("/add")
	public int createCliente(@RequestBody Cliente cliente) {
		return clienteService.create(cliente);
	}
	@DeleteMapping("/{id}")
	public int deleteCliente(@PathVariable int id) {
		return clienteService.delete(id);
	}
	@GetMapping("/{id}")
	public Cliente getClienteId(@PathVariable int id) {
		return clienteService.read(id);
	}
	@PutMapping("/{id}")
	public int update(@RequestBody Cliente l, @PathVariable int id) {
		l.setIdcliente(id);
		return clienteService.update(l);
	}
	
}
