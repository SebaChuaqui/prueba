package modulo1.ejercicio38.model;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {

	private String numero;
	private Aerolinea aerolinea;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private ArrayList<Asiento> asientos;
	private ArrayList<Tarifa> tarifas;
	private Date salida;
	private Date llegada;

	// constructor
	public Vuelo(String numero, Aerolinea aerolinea, Aeropuerto origen, Aeropuerto destino, ArrayList<Asiento> asientos,
			ArrayList<Tarifa> tarifas, Date salida, Date llegada) {
		this.numero = numero;
		this.aerolinea = aerolinea;
		this.origen = origen;
		this.destino = destino;
		this.asientos = asientos;
		this.tarifas = tarifas;
		this.salida = salida;
		this.llegada = llegada;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}

	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	public ArrayList<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(ArrayList<Asiento> asientos) {
		this.asientos = asientos;
	}

	public Date getSalida() {
		return salida;
	}

	public void setSalida(Date salida) {
		this.salida = salida;
	}

	public Date getLlegada() {
		return llegada;
	}

	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}

	public ArrayList<Tarifa> getTarifas() {
		return tarifas;
	}

	public void setTarifas(ArrayList<Tarifa> tarifas) {
		this.tarifas = tarifas;
	}
}
