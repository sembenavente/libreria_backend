package com.sembenavente.demo.entity;

public class Empleado {

	private int idempleado;
	private String nombres;
	private String apellidos;
	private String dni;
	private String correo;
	private String clave;
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Empleado(int idempleado, String nombres, String apellidos, String dni, String correo, String clave) {
		super();
		this.idempleado = idempleado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.correo = correo;
		this.clave = clave;
	}
	public Empleado() {
		super();
		
	}
	
	
}
