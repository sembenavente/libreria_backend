package com.sembenavente.demo.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sembenavente.demo.dao.IClienteDao;
import com.sembenavente.demo.entity.Cliente;
import com.sembenavente.demo.service.IClienteService;

@Service
public class ClienteServiceImp implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public int create(Cliente l) {
		// TODO Auto-generated method stub
		return clienteDao.create(l);
	}

	@Override
	public int update(Cliente l) {
		// TODO Auto-generated method stub
		return clienteDao.update(l);
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return clienteDao.delete(key);
	}

	@Override
	public Cliente read(int key) {
		// TODO Auto-generated method stub
		return clienteDao.read(key);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return clienteDao.readAll();
	}

}
