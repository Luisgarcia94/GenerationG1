package com.generation.f20220601.modelos;

public class Mascota {

	private String especie;
	private String nombre;
	private String pelaje;
	private String sexo;
	private float peso;
	private String color = "Blanquito";
	private boolean cola;
	
	public Mascota(String especie, String nombre, String pelaje, String sexo, float peso, String color, boolean cola) {
		super();
		this.especie = especie;
		this.nombre = nombre;
		this.pelaje = pelaje;
		this.sexo = sexo;
		this.peso = peso;
		this.color = color;
		this.cola = cola;
	}

	public Mascota() {
		super();
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCola() {
		return cola;
	}

	public void setCola(boolean cola) {
		this.cola = cola;
	}

	@Override
	public String toString() {
		return "Mascota [especie=" + especie + ", nombre=" + nombre + ", pelaje=" + pelaje + ", sexo=" + sexo
				+ ", peso=" + peso + ", color=" + color + ", cola=" + cola + "]";
	}
	
	
	public void hacerSonido() {
		System.out.println("muuu");
	}
	
}
