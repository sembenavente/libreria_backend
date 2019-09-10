package com.sembenavente.demo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sembenavente.demo.dao.IClienteDao;
import com.sembenavente.demo.entity.Cliente;

@Repository
public class ClienteDaoImp implements IClienteDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Cliente l) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO clientes(dni, nombres, apellidos, telefono) VALUES(?,?,?,?)";
		return jdbcTemplate.update(SQL,l.getDni(),l.getNombres(),l.getApellidos(),l.getTelefono());
	}

	@Override
	public int update(Cliente l) {
		// TODO Auto-generated method stub
		String SQL="UPDATE clientes SET dni=?, nombres=?, apellidos=?, telefono=? WHERE idcliente=?";
		return jdbcTemplate.update(SQL,l.getDni(),l.getNombres(),l.getApellidos(),l.getIdcliente());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM clientes WHERE idcliente=?";
		return jdbcTemplate.update(SQL,key);
	}

	@Override
	public Cliente read(int key) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM clientes WHERE idcliente=?";
		return jdbcTemplate.queryForObject(SQL,new Object[]{key},new BeanPropertyRowMapper<>(Cliente.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("SELECT * FROM clientes");
	}

}
