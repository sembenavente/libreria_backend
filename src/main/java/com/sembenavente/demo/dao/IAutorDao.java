package com.sembenavente.demo.dao;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Autor;

public interface IAutorDao {

	public int create(Autor l);
	  public int update(Autor l);
	  public int delete(int key);
	  public Autor read(int key);
	  public List<Map<String,Object>> readAll();
}
