package uni;

import java.util.Scanner;

public class dimension {
	
	public static void main(String[] args) {
		
		int prom=0;
		int sum=0;
		int tamano=10;
		int array[] = new int[tamano];
		
		Scanner D = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("ingrese un numero: " + i);
			array[i] = D.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			
			sum=sum+array[i];
			prom=sum/tamano;
		}
		
		System.out.println("suma: " + sum);
		System.out.println("promedio: " + prom);
		}
	}
		
