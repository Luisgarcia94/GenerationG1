package com.generation.f20220527;

public class Auto {

	//clase es modelo o prototipo
	//objeto, nace a partir de una clase, característica o atributo
	//tiene metodos o funciones
	//algo concreto, lo convertimos en abstractp
	//tangible: usamos los 5 sentidos para describirlo
	//atributo de colaboracion: Tomar un objeto y usarlo como atributo
	
	//atributo
	//accesador tipo nombreDelAtributo 
	
	private String color,marca,modelo;
	private Double velocidad;
	
	//constructor vacío
	public Auto() {
		
	}
	
	//constructor con parametros

	public Auto(String color, String marca, String modelo, Double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	//accesadores y mutadores
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	//funciones creadas dentro de un objeto no llevan static
	
	public void aumentarVelocidad() {
		this.velocidad = 10d;
	}
	

	
}

