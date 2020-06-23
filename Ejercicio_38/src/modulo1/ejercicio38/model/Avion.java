package modulo1.ejercicio38.model;

public class Avion {

	private String compania;
	private String tipo;
	private int numeroPasajeros;

	// constructor
	public Avion(String compania, String tipo, int numeroPasajeros) {
		this.compania = compania;
		this.tipo = tipo;
		this.numeroPasajeros = numeroPasajeros;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
}
