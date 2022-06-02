package com.generation.f20220601.modelos;

public class Pollo extends Mascota{

	private String pico;
	



	public Pollo(String pico) {
		super();
		this.pico = pico;
	}
	
	public Pollo() {
		super();
	}


	public String getPico() {
		return pico;
	}



	public void setPico(String pico) {
		this.pico = pico;
	}
	
}
