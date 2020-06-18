package Herencia1;


public class Principal {
    public  static void main (String[] args){
        
       Producto ListaProductos[]=new Producto[3];
       
       ListaProductos[0]=new Producto ("producto1", 20);
       ListaProductos[1]=new Perecible (1, "producto2",20);
       ListaProductos[2]=new Noperecible ("tipo 1", "producto 3", 1);

       
       double suma=0;
       for(int i=0;i<ListaProductos.length;i++){
           suma=suma+ListaProductos[i].Calcular(5);
       }
        System.out.println("El precio total de productos es: "+suma);
      
      
    }
    
}