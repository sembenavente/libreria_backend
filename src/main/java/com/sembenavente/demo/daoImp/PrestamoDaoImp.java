package com.sembenavente.demo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sembenavente.demo.dao.IPrestamoDao;
import com.sembenavente.demo.entity.Prestamo;

@Repository
public class PrestamoDaoImp implements IPrestamoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Prestamo l) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO prestamos(fecha, idempleado, idcliente) "
				+ "VALUES(?,?,?)";
		return jdbcTemplate.update(SQL,l.getFecha(),l.getIdempleado(),l.getIdcliente());
	}

	@Override
	public int update(Prestamo l) {
		// TODO Auto-generated method stub
		String SQL="UPDATE prestamos SET fecha=?, idempleado=?, idcliente=? WHERE idprestamo=?";
		return jdbcTemplate.update(SQL, l.getFecha(), l.getIdempleado(), l.getIdcliente(), l.getIdprestamo());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM prestamos WHERE idprestamo=?";
		return jdbcTemplate.update(SQL,key);
	}

	@Override
	public Prestamo read(int key) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM prestamos WHERE idprestamo=?";
		return jdbcTemplate.queryForObject(SQL,new Object[]{key},new BeanPropertyRowMapper<>(Prestamo.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		/*String SQL="select p.idprestamo idprestamo_p, p.fecha fecha_p, e.idempleado idempleado_e, c.idcliente idcliente_c, \n" + 
				"c.nombres nombres_c, c.apellidos apellidos_c, c.dni dni_c, c.telefono telefono_c, e.nombres nombres_e, \n" + 
				"e.apellidos apellidos_e, e.dni dni_e, e.correo correo_e, e.clave clave_e\n" + 
				"from  prestamos p,  clientes c, empleados e \n" + 
				"where   p.idcliente=c.idcliente\n" + 
				"and p.idempleado=e.idempleado";*/
		String SQL = "SELECT * FROM prestamos";
		return jdbcTemplate.queryForList(SQL);
	}

}
