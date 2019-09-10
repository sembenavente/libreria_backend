package com.sembenavente.demo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sembenavente.demo.dao.IDetalleDao;
import com.sembenavente.demo.entity.Detalle;

@Repository
public class DetalleDaoImp implements IDetalleDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Detalle l) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO detalles(titulo, edicion, idlibro, idprestamo) "
				+ "VALUES(?,?,?,?)";
		return jdbcTemplate.update(SQL,l.getTitulo(),l.getEdicion(),l.getIdlibro(),l.getIdprestamo());
	}

	@Override
	public int update(Detalle l) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE detalles SET titulo=?, edicion =?, idlibro=?, idprestamo=? WHERE iddetalle=?";
		return jdbcTemplate.update(SQL,l.getTitulo(),l.getEdicion(),l.getIdlibro(),l.getIdprestamo(),l.getIddetalle());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String SQL ="DELETE FROM detalles WHERE iddetalle = ?";
		return jdbcTemplate.update(SQL,key);
	}

	@Override
	public Detalle read(int key) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM detalles WHERE iddetalle=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {key},new BeanPropertyRowMapper<>(Detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		/*String SQL = "select d.iddetalle iddetalle_d, d.edicion edicion_d, d.titulo tiulo_d, p.idprestamo idprestamo_p, p.fecha fecha_p, e.idempleado idempleado_e, c.idcliente idcliente_c, \n" + 
				"c.nombres nombres_c, c.apellidos apellidos_c, c.dni dni_c, c.telefono telefono_c, e.nombres nombres_e, \n" + 
				"e.apellidos apellidos_e, e.dni dni_e, e.correo correo_e, e.clave clave_e, \n" + 
				"l.idlibro idlibro_l, l.annio annio_l, l.edicion edicion_l, l.titulo titulo_l, a.idautor idautor_a, \n" + 
				"a.nombres nombres_a, a.apellidos apellidos_a \n" + 
				"from prestamos p,  clientes c, empleados e, libros l, autores a, detalles d \n" + 
				"where p.idcliente=c.idcliente\n" + 
				"and p.idempleado=e.idempleado \n" + 
				"and d.idprestamo=p.idprestamo \n" + 
				"and d.idlibro=l.idlibro";*/
		String SQL = "SELECT * FROM detalles";
		return jdbcTemplate.queryForList(SQL);
	}

}
