package com.generation.f20220531;

public class Cliente {


	private String nombre;
	private int id;
	private String rut;
	private String correo;
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, int id, String rut,String correo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.rut = rut;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getCorreo() {
		
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", id=" + id + ", rut=" + rut + "]";
	}
	
	
}
