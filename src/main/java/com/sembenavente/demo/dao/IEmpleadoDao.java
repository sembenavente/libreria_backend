package com.sembenavente.demo.dao;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Empleado;

public interface IEmpleadoDao {

	public int create(Empleado l);
	  public int update(Empleado l);
	  public int delete(int key);
	  public Empleado read(int key);
	  public List<Map<String,Object>> readAll();
	  public int login(String user, String clave);
	  
}
