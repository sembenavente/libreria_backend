package com.sembenavente.demo.service;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Detalle;

public interface IDetalleService {

	public int create(Detalle l);
	  public int update(Detalle l);
	  public int delete(int key);
	  public Detalle read(int key);
	  public List<Map<String,Object>> readAll();
}
