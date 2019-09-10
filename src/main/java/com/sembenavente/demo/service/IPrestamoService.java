package com.sembenavente.demo.service;

import java.util.List;
import java.util.Map;

import com.sembenavente.demo.entity.Prestamo;

public interface IPrestamoService {

	public int create(Prestamo l);
	  public int update(Prestamo l);
	  public int delete(int key);
	  public Prestamo read(int key);
	  public List<Map<String,Object>> readAll();
}
