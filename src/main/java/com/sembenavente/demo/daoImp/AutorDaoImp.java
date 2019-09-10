package com.sembenavente.demo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sembenavente.demo.dao.IAutorDao;
import com.sembenavente.demo.entity.Autor;

@Repository
public class AutorDaoImp implements IAutorDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Autor l) {
		// TODO Auto-generated method stub
		String SQL="INSERT INTO autores(nombres, apellidos) values(?,?)";
		return jdbcTemplate.update(SQL,l.getNombres(),l.getApellidos());
	}

	@Override
	public int update(Autor l) {
		// TODO Auto-generated method stub
		String SQL="UPDATE autores SET nombres=?, apellidos=? WHERE idautor=?";
		return jdbcTemplate.update(SQL,l.getNombres(),l.getApellidos(), l.getIdautor());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM autores WHERE idautor=?";
		return jdbcTemplate.update(SQL,key);
	}

	@Override
	public Autor read(int key) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM autores WHERE idautor=?";
		return jdbcTemplate.queryForObject(SQL,new Object[]{key},new BeanPropertyRowMapper<>(Autor.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM  autores ";
		return jdbcTemplate.queryForList(SQL);
	}

}
