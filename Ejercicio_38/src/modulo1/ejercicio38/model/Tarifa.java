package modulo1.ejercicio38.model;

public class Tarifa {

	private String clase;
	private int precio;
	private int impuestos;

	// constructor
	public Tarifa(String clase, int precio, int impuestos) {
		this.clase = clase;
		this.precio = precio;
		this.impuestos = impuestos;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(int impuestos) {
		this.impuestos = impuestos;
	}

}
