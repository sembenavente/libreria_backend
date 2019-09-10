package com.sembenavente.demo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sembenavente.demo.entity.Prestamo;
import com.sembenavente.demo.service.IPrestamoService;
import com.sembenavente.demo.dao.IPrestamoDao;;

@Service
public class PrestamoService implements IPrestamoService {

	@Autowired
	private IPrestamoDao prestamoDao;
	
	@Override
	public int create(Prestamo l) {
		// TODO Auto-generated method stub
		return prestamoDao.create(l);
	}

	@Override
	public int update(Prestamo l) {
		// TODO Auto-generated method stub
		return prestamoDao.update(l);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return prestamoDao.delete(key);
	}

	@Override
	public Prestamo read(int key) {
		// TODO Auto-generated method stub
		return prestamoDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return prestamoDao.readAll();
	}

}
