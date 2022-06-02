package com.generation.f20220602.ejercicio;

public class Vendedor extends Usuario {
	    private Boolean puedePublicar;
	    private int cantPublicaciones;
	    
		public Vendedor() {
			super();
		}

		public Vendedor(Boolean puedePublicar, int cantPublicaciones) {
			super();
			this.puedePublicar = puedePublicar;
			this.cantPublicaciones = cantPublicaciones;
		}

		public Boolean getPuedePublicar() {
			return puedePublicar;
		}

		public void setPuedePublicar(Boolean puedePublicar) {
			this.puedePublicar = puedePublicar;
		}

		public int getCantPublicaciones() {
			return cantPublicaciones;
		}

		public void setCantPublicaciones(int cantPublicaciones) {
			this.cantPublicaciones = cantPublicaciones;
		}
		
		
		@Override
		public String toString() {
			return "Vendedor [puedePublicar=" + puedePublicar + ", cantPublicaciones=" + cantPublicaciones + "]";
		}

		@Override
		
		public Boolean login(String nombre, String password) {
			
			if (nombre.equals("nombreUsuario") && password.equals("test123")) {
				System.out.println("Has iniciado Sesion como Vendedor");
				return true;
			} else {
				System.out.println("Acceso denegado como Vendedor");
				return false;
			}

		}
		
		  public String respondePreguntas(String respuesta) {
				System.out.println("su respuesta es: " + respuesta);
				return respuesta;
			} 

	    
	    
}

