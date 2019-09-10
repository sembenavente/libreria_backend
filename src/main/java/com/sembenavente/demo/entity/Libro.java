package com.sembenavente.demo.entity;

public class Libro {
   private int idlibro;
   private String titulo;
   private String edicion;
   private String annio;
   private int idautor;

public Libro() {
}

public Libro(int idlibro, String titulo, String edicion, String annio, int idautor) {
	this.idlibro = idlibro;
	this.titulo = titulo;
	this.edicion = edicion;
	this.annio = annio;
	this.idautor = idautor;
}

public int getIdlibro() {
	return idlibro;
}

public void setIdlibro(int idlibro) {
	this.idlibro = idlibro;
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

public String getAnnio() {
	return annio;
}

public void setAnnio(String annio) {
	this.annio = annio;
}

public int getIdautor() {
	return idautor;
}

public void setIdautor(int idautor) {
	this.idautor = idautor;
}
   
}
