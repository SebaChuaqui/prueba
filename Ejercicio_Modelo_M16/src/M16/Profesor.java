package M16;

	public class Profesor extends Persona {
		
		private String IdProfesor;

		public Profesor(String nombre, String apellido, int edad) {
			super(nombre, apellido, edad);

		}
	
	public void setIdProfesor (String IdProfesor) {
		
		this.IdProfesor=IdProfesor;
	}
	
	public String getIdProfesor () {
		
		return IdProfesor;
	}
	
	public void mostrarNombreApellido () {
		
		System.out.println("Nombre profesor: " + getNombre() + "" + getApellido());
	}
	}