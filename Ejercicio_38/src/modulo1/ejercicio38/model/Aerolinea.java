package modulo1.ejercicio38.model;

import java.util.ArrayList;

public class Aerolinea {

	private String nombre;
	private ArrayList<Avion> aviones;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public void setAviones(ArrayList<Avion> aviones) {
		this.aviones = aviones;
	}
}
