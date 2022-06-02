package com.generation.f20220601.modelos;

public class Perro extends Mascota {

	private Integer cantDePaseos;
	private String sonidoVocal;
	
	public Perro() {
		super();
	}
	

	public Perro(Integer cantDePaseos, String sonidoVocal) {
		super();
		this.cantDePaseos = cantDePaseos;
		this.sonidoVocal = sonidoVocal;
	}


	@Override
	public String toString() {
		return "Perro [cantDePaseos=" + cantDePaseos + ", sonidoVocal=" + sonidoVocal + "]";
	}
	
	public void hacerSonido() {
		System.out.println("guau,guau");
	}
	
}
