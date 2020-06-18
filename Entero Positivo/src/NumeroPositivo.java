
import java.util.Scanner;

public class NumeroPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduzca Valor de Numero Positivo: ");
        num = sc.nextInt();                   
        System.out.println(num/1000);
        System.out.println(num/100);
        System.out.println(num/10);
        System.out.println(num);
    }
}