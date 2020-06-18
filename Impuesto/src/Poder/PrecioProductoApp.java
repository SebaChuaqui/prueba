package Poder;

import java.util.Scanner;


public class PrecioProductoApp {

	public static void main(String[] args) {
		
		double precio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese Precio");
		
		precio=sc.nextDouble();
		
		if (precio > 0){
	           precio = precio + (precio *0.19);
	        }
		
		System.out.println ("El precio con IVA es: " + precio);

	}
}
