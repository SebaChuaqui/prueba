
public class CuentaApp {
 
    public static void main(String[] args) {
         
        Cuenta cuenta_1 = new Cuenta("Sebastian", -1000);
        Cuenta cuenta_2 = new Cuenta("Alejandro", 600);
        Cuenta cuenta_3 = new Cuenta("Carolina", 700); 
     
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
        cuenta_3.ingresar(400);
        
        cuenta_1.retirar(500);
        cuenta_2.retirar(100);
        cuenta_3.retirar(300);

        System.out.println(cuenta_1); 
        System.out.println(cuenta_2); 
        System.out.println(cuenta_3);
    }
     
}