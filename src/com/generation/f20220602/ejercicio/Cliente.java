package com.generation.f20220602.ejercicio;

public class Cliente extends Usuario{
	
    private int cantCompras;
    private String interes;
    
	public Cliente() {
		super();
	}

	public Cliente(int cantCompras, String interes) {
		super();
		this.cantCompras = cantCompras;
		this.interes = interes;
	}

	public int getCantCompras() {
		return cantCompras;
	}

	public void setCantCompras(int cantCompras) {
		this.cantCompras = cantCompras;
	}

	public String getInteres() {
		return interes;
	}

	public void setInteres(String interes) {
		this.interes = interes;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [cantCompras=" + cantCompras + ", interes=" + interes + "]";
	}

	@Override
	
	public Boolean login(String nombre, String password) {
		
		if (nombre.equals("nombreUsuario") && password.equals("test123")) {
			System.out.println("Has iniciado Sesion como Cliente");
			return true;
		} else {
			System.out.println("Acceso denegado como Cliente");
			return false;
		}

	}
	
	  public String hacerPreguntas(String pregunta) {
			System.out.println("La pregunta ha sido publicada como: " + pregunta);
			return pregunta;
		}

   
}
