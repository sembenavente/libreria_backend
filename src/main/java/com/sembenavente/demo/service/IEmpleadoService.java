package com.sembenavente.demo.service;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Empleado;

public interface IEmpleadoService {

	public int create(Empleado l);
	  public int update(Empleado l);
	  public int delete(int key);
	  public Empleado read(int key);
	  public List<Map<String,Object>> readAll();
	  public int login(String correo, String clave);
}
