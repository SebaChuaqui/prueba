import java.util.Scanner;

  public class CadInver {
    public static void main(String[] args) {
        
    	Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca Texto o Palabra");
        
        String cad = tec.nextLine(); 
        String Invertida = "";

        for (int n = cad.length() - 1 ; n >= 0; n--) {
            char caden = cad.charAt(n); 
            Invertida = Invertida + caden;
        }

        System.out.println("La cadena invertida es: " + Invertida);
    }
  }
