package modulo1.ejercicio38.model;

import java.util.ArrayList;

public class Reserva {

	private ArrayList<Asiento> asiento;
	private int costoTotal;
	private int numeroReserva;
	private Usuario usuario;

	// constructor
	public Reserva(ArrayList<Asiento> asiento, int costoTotal, int numeroReserva, Usuario usuario) {
		this.asiento = asiento;
		this.costoTotal = costoTotal;
		this.numeroReserva = numeroReserva;
		this.usuario = usuario;
	}

	public ArrayList<Asiento> getAsiento() {
		return asiento;
	}

	public void setAsiento(ArrayList<Asiento> asiento) {
		this.asiento = asiento;
	}

	public int getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(int costoTotal) {
		this.costoTotal = costoTotal;
	}

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
