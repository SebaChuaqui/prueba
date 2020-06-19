import javax.swing.JOptionPane;
public class ArrayAleatorio {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Ingrese un tamaño");
        
        int numero[]=new int[Integer.parseInt(texto)];
 
        rellenarNumAleatorioArray(numero, 0, 9);
 
        mostrarArray(numero);
    }
 
    
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        
    	int suma = 0;
    	
    	for(int i=0;i<lista.length;i++){
        	
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
            suma=suma+lista[i];
        }
    	
    	System.out.println("La suma de todos es: " + suma);
    	
    }
   
    public static void mostrarArray(int lista[]){
    	
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" -> esta el valor = "+lista[i]);

        }
        
		
    }
}