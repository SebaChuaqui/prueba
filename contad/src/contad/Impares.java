package contad;

public class Impares {

	public static void main(String[] args) {
		
		int contador,hh;
		hh=2;
		contador=1;
		while(contador<=100)
		{
			
			System.out.println("Los numeros impares son:" + contador);
			contador = contador +2;
			hh = hh + 1;
		}
		
		System.out.println("Numero total impares: " + hh);
		

	}

}
