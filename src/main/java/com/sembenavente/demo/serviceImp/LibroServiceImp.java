package com.sembenavente.demo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sembenavente.demo.dao.ILibroDao;
import com.sembenavente.demo.entity.Libro;
import com.sembenavente.demo.service.ILibroService;

@Service
public class LibroServiceImp implements ILibroService{
	@Autowired
	private ILibroDao libroDao;
	@Override
	public int create(Libro l) {
		// TODO Auto-generated method stub
		return libroDao.create(l);
	}

	@Override
	public int update(Libro l) {
		// TODO Auto-generated method stub
		return libroDao.update(l);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return libroDao.delete(key);
	}

	@Override
	public Libro read(int key) {
		// TODO Auto-generated method stub
		return libroDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return libroDao.readAll();
	}

}
