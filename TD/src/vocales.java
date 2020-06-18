import java.util.Scanner;

public class vocales {
 
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Ingrese Frase o Palabra");
        
        String cadena = teclado.nextLine(); 
        
        int Vocales = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char let = cadena.charAt(i); 
            
            if (let == 'a' || let == 'e' || let ==  'i' || 
            	let == 'o' || let == 'u') {
                
            	Vocales++;
            }
        }
        System.out.println("La candidad de vocales es: " + Vocales);
    }
  }