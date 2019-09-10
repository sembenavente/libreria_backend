package com.sembenavente.demo.entity;

public class Detalle {

	private int iddetalle;
	private String titulo;
	private String edicion;
	private int idlibro;
	private int idprestamo;
	
	public int getIddetalle() {
		return iddetalle;
	}
	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public int getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}
	public int getIdprestamo() {
		return idprestamo;
	}
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}
	public Detalle(int iddetalle, String titulo, String edicion, int idlibro, int idprestamo) {
		super();
		this.iddetalle = iddetalle;
		this.titulo = titulo;
		this.edicion = edicion;
		this.idlibro = idlibro;
		this.idprestamo = idprestamo;
	}
	public Detalle() {
		super();
	}
		
}
