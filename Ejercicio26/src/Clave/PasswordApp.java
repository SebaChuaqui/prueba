package Clave;

import javax.swing.JOptionPane;

public class PasswordApp {
  
    public static void main(String[] args) {
  
        String texto=JOptionPane.showInputDialog("Ingresa un tamaño para la clave");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Ingresa la longitud de la clave ");
        int longitud=Integer.parseInt(texto);
  
        Password listaPassword[]=new Password[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
        }
    }
  
}