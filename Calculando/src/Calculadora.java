
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
       
        int operando1;
        int operando2;
        int resultado=0;
 
        System.out.println("Ingrese Primer Numero");
        operando1=sc.nextInt();
        
        System.out.println("Ingrese Operacion");
        String operacion = sc.next();
        
        System.out.println("Ingrese Segundo Numero");
        operando2=sc.nextInt();

        switch (operacion){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                resultado=operando1/operando2;
                break;
            case "^":
                resultado=(int)Math.pow(operando1, operando2);
                break;
            case "%":
                resultado=operando1%operando2;
                break;
        }
 
        System.out.println( operando1+" "+operacion+" "+operando2+" = "+resultado);
 
    }
}


