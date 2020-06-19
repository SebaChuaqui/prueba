import javax.swing.JOptionPane;
public class array14 {
 
    public static void main(String[] args) {
 
        final int TAMANO=14;
 
        int n[]=new int[TAMANO];
        
        rellenarArray(n);
 
        mostrarArray(n);
    }
    
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Ingrese un número");
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" -> el valor es = "+lista[i]);
        }
    }
}