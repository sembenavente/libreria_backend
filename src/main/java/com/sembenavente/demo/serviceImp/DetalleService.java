package com.sembenavente.demo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sembenavente.demo.dao.IDetalleDao;
import com.sembenavente.demo.entity.Detalle;
import com.sembenavente.demo.service.IDetalleService;

@Service
public class DetalleService implements IDetalleService {

	@Autowired
	private IDetalleDao detalleDao;
	
	@Override
	public int create(Detalle l) {
		// TODO Auto-generated method stub
		return detalleDao.create(l);
	}

	@Override
	public int update(Detalle l) {
		// TODO Auto-generated method stub
		return detalleDao.update(l);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return detalleDao.delete(key);
	}

	@Override
	public Detalle read(int key) {
		// TODO Auto-generated method stub
		return detalleDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalleDao.readAll();
	}

}
