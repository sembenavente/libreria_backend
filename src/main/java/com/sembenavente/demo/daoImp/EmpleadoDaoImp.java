package com.sembenavente.demo.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sembenavente.demo.dao.IEmpleadoDao;
import com.sembenavente.demo.entity.Empleado;

@Repository
public class EmpleadoDaoImp implements IEmpleadoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Empleado l) {
		// TODO Auto-generated method stub
		String SQL ="INSERT INTO empleados(nombres, apellidos, dni, correo, clave) VALUES(?,?,?,?,?)";
		return jdbcTemplate.update(SQL,l.getNombres(),l.getApellidos(),l.getDni(),l.getCorreo(),l.getClave());
	}

	@Override
	public int update(Empleado l) {
		// TODO Auto-generated method stub
		String SQL="UPDATE empleados SET nombres=?, apellidos=?, dni=?, correo=?, clave=? WHERE idempleado=?";
		return jdbcTemplate.update(SQL,l.getNombres(),l.getApellidos(), l.getDni(), l.getCorreo(),l.getClave(),l.getIdempleado());
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		String SQL="DELETE FROM empleados WHERE idempleado=?";
		return jdbcTemplate.update(SQL,key);
	}

	@Override
	public Empleado read(int key) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM empleados WHERE idempleado=?";
		return jdbcTemplate.queryForObject(SQL,new Object[]{key},new BeanPropertyRowMapper<>(Empleado.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM  empleados ";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public int login(String correo, String clave) {
		// TODO Auto-generated method stub
		String SQL ="SELECT correo, clave FROM empleados;";
		List<Map<String, Object>> res = jdbcTemplate.queryForList(SQL);
		int i = res.size(),r=0,j=0;
		do {
			if(res.get(j).get("correo").equals(correo)&&res.get(j).get("clave").equals(clave)) {
				r=1;
			}
			i--;
			j++;
		}
		while(r==0&&i>0);
		return r;
	}

}
