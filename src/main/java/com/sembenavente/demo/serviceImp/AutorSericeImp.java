package com.sembenavente.demo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sembenavente.demo.dao.IAutorDao;
import com.sembenavente.demo.entity.Autor;
import com.sembenavente.demo.service.IAutorService;

@Service
public class AutorSericeImp implements IAutorService {

	@Autowired
	private IAutorDao autorDao;
	
	@Override
	public int create(Autor l) {
		// TODO Auto-generated method stub
		return autorDao.create(l);
	}

	@Override
	public int update(Autor l) {
		// TODO Auto-generated method stub
		return autorDao.update(l);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return autorDao.delete(key);
	}

	@Override
	public Autor read(int key) {
		// TODO Auto-generated method stub
		return autorDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return autorDao.readAll();
	}

}
