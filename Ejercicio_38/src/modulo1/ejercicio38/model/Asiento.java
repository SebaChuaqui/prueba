package modulo1.ejercicio38.model;

public class Asiento {

	private int fila;
	private String letra;
	private boolean comprado;

	// constructor
	public Asiento(int fila, String letra, boolean comprado) {
		this.fila = fila;
		this.letra = letra;
		this.comprado = comprado;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}
}
