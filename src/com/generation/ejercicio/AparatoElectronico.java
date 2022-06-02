package com.generation.ejercicio;

public class AparatoElectronico extends AparatoElectrico{

	private String transistores;
	private String ram;
	private String procesador;
	
	
	public AparatoElectronico() {
		super();
	}


	public AparatoElectronico(String transistores, String ram, String procesador) {
		super();
		this.transistores = transistores;
		this.ram = ram;
		this.procesador = procesador;
	}


	public String getTransistores() {
		return transistores;
	}


	public void setTransistores(String transistores) {
		this.transistores = transistores;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	
	
}
