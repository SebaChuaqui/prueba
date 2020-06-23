package modulo1.ejercicio38.model;

public class Usuario {

	private String nombre;
	private String clave;
	private String direccion;

	// constructor

	public Usuario(String nombre, String clave, String direccion) {
		this.nombre = nombre;
		this.clave = clave;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
