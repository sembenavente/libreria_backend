package com.sembenavente.demo.service;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Libro;

public interface ILibroService {
	public int create(Libro l);
	  public int update(Libro l);
	  public int delete(int key);
	  public Libro read(int key);
	  public List<Map<String,Object>> readAll();
}
