package com.sembenavente.demo.daoImp;

//import java.sql.Types;
import java.util.List;
import java.util.Map;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
/*import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;*/
import org.springframework.stereotype.Repository;

import com.sembenavente.demo.dao.ILibroDao;
import com.sembenavente.demo.entity.Libro;


@Repository
public class LibroDaoImp implements ILibroDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int create(Libro l) {
		// TODO Auto-generated method stub
		/*String SQL="CALL crearLibro(?,?,?,?,?)";
		String resp = "no funca";
		int a = jdbcTemplate.update(SQL,l.getTitulo(),l.getEdicion(),l.getAnnio(), l.getIdautor(),resp);
		System.out.println(resp);*/
		
		/*
		SimpleJdbcCall call= new SimpleJdbcCall(jdbcTemplate).withProcedureName("crearLibro").declareParameters(
				new SqlParameter("titulo", Types.VARCHAR),
				new SqlParameter("edicion", Types.VARCHAR),
				new SqlParameter("annio", Types.VARCHAR),
				new SqlParameter("idautor", Types.INTEGER),
				new SqlOutParameter("@rpt", Types.VARCHAR)
				);
		Map<String,Object> execute = call.execute(new MapSqlParameterSource("titulo",l.getTitulo()), 
				new MapSqlParameterSource("edicion", l.getEdicion()),
				new MapSqlParameterSource("annio", l.getAnnio()),
				new MapSqlParameterSource("idautor", l.getIdautor()));
		
		return 0;*/
		String SQL = "INSERT INTO libros(titulo, edicion, annio, idautor) VALUES(?,?,?,?)";
		return jdbcTemplate.update(SQL,l.getTitulo(),l.getEdicion(),l.getAnnio(),l.getIdautor());
	}

	@Override
	public int update(Libro l) {
		// TODO Auto-generated method stub
		String SQL="UPDATE libros SET titulo=?, edicion=?, annio=?, idautor=? WHERE idlibro=?";
		return jdbcTemplate.update(SQL,l.getTitulo(),l.getEdicion(),l.getAnnio(),l.getIdautor(),l.getIdlibro());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM libros WHERE idlibro=?";
		return jdbcTemplate.update(SQL,key);
	}

	@Override
	public Libro read(int key) {
		
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM libros WHERE idlibro=?";
		return jdbcTemplate.queryForObject(SQL,new Object[]{key},new BeanPropertyRowMapper<>(Libro.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM libros ";
		return jdbcTemplate.queryForList(SQL);
	}

}
