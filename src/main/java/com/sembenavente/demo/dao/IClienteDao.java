package com.sembenavente.demo.dao;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Cliente;

public interface IClienteDao {

	public int create(Cliente l);
	  public int update(Cliente l);
	  public int delete(int key);
	  public Cliente read(int key);
	  public List<Map<String,Object>> readAll();
}
