package modulo1.clase8;
import java.util.Scanner;
public class NumeroVentas {
	public static void main(String[] args) {
		 // declaraci�n de variables
        int i, numeroVentas, venta, totalVentas;
        // Inicializaci�n de Variable
        totalVentas = 0;
        Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Numero de Ventas");
		numeroVentas = sc.nextInt(); 
        for (i = 1; i <= numeroVentas; i++) {
    		System.out.println("Ingrese Venta " + i + ": ");
    		venta = sc.nextInt();
    		totalVentas = totalVentas + venta;
        }
        System.out.println("Ventas Totales: " + totalVentas);
	}
}