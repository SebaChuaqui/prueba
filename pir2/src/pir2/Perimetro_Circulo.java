package pir2;

import java.util.Scanner;

public class Perimetro_Circulo {

	public static void main(String[] args) {
		
		int radio;
		int r2;
		double pi;
		double perimetro;
		
		pi = 3.1416;
		
		Scanner dato = new Scanner(System.in);
		
		System.out.println("¿Cual es el radio?:" + " ");
		
		radio=dato.nextInt();
		r2=radio*radio;
		perimetro=pi*r2;
		
		System.out.println("El Perimetro es : " + perimetro);
	}

}
