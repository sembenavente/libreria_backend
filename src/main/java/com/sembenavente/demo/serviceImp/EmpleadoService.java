package com.sembenavente.demo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sembenavente.demo.entity.Empleado;
import com.sembenavente.demo.service.IEmpleadoService;
import com.sembenavente.demo.dao.IEmpleadoDao;;

@Service
public class EmpleadoService implements IEmpleadoService {

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	public int create(Empleado l) {
		// TODO Auto-generated method stub
		return empleadoDao.create(l);
	}

	@Override
	public int update(Empleado l) {
		// TODO Auto-generated method stub
		return empleadoDao.update(l);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return empleadoDao.delete(key);
	}

	@Override
	public Empleado read(int key) {
		// TODO Auto-generated method stub
		return empleadoDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return empleadoDao.readAll();
	}

	@Override
	public int login(String correo, String clave) {
		// TODO Auto-generated method stub
		return empleadoDao.login(correo, clave);
	}
	
}
