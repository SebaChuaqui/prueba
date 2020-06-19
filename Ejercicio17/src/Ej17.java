// Desarrolle una aplicación la cual nos debe solicitar por teclado un número entero positivo
// (debemos controlarlo) y muestra el número de cifras que tiene. Por ejemplo: si introducimos
// 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o más cifras, al
// mostrar el mensaje.

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        int num, cont = 0;
        System.out.println("Ingrese un Numero");
        num = teclado.nextInt();
        
        while(num>0){
            cont++;
            num = num/10;
           
        }
            System.out.println("El numero tiene "+cont+" Cifras");
           }
	}