package com.sembenavente.demo.entity;

public class Prestamo {

	private int idprestamo;
	private String fecha;
	private int idempleado;
	private int idcliente;
	public int getIdprestamo() {
		return idprestamo;
	}
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public Prestamo(int idprestamo, String fecha, int idempleado, int idcliente) {
		super();
		this.idprestamo = idprestamo;
		this.fecha = fecha;
		this.idempleado = idempleado;
		this.idcliente = idcliente;
	}
	public Prestamo() {
		super();
	}
	
	
	
}
