
import java.util.ArrayList;

public class Ejemplo {

	public static void main(String[] args) {

		ArrayList listaNums = new ArrayList();
		
		listaNums.add(8);
		listaNums.add(3);
		listaNums.add(5);
		
		System.out.println("Lista de numeros : " + listaNums);
		System.out.println("Numero de posicion : 3 " + listaNums.get(2));
		
		listaNums.set(0, 15);
		
		System.out.println("Lista de numeros : " + listaNums);
		
	}

}
