package M16;

public class Principal {

	public static void main(String[] args) {
		
		Profesor profe = new Profesor(" Alejandro ",  "Perez " , 77);
		Profesor profe2 = new Profesor(" Luis ",  "Alvarez " , 55);
		profe.mostrarNombreApellido();
		profe2.mostrarNombreApellido();
	}

}
