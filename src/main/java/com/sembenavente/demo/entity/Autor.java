package com.sembenavente.demo.entity;

public class Autor {
	
	private int idautor;
	private String nombres;
	private String apellidos;
	
	
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
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
	public Autor(int idautor, String nombres, String apellidos) {
		super();
		this.idautor = idautor;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}
	
	public Autor() {
		super();
		
	}

}
