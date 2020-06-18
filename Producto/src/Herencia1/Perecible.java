package Herencia1;


public class Perecible extends Producto{
 
	public int DiasCad;  
 
	public Perecible(int DiasCad,String Nombre,double Precio){
     super( Nombre, Precio);
     this.DiasCad=DiasCad;
 }

    public int getDiasCaducar() {
        return DiasCad;
    }

    public void setDiasCaducar(int DiasCaducar) {
        this.DiasCad = DiasCaducar;
    }
   public double  Calcular(int Cantidad){
     double  PrecioTotal=Cantidad*this.Precio;
     
     switch(this.DiasCad){
         
     	case 1:
               PrecioTotal=(PrecioTotal/4);
             break;
         
     	case 2:
             PrecioTotal=(PrecioTotal/3);
             break;
         
     	case 3:
             PrecioTotal=(PrecioTotal/2);
             break;
     }  
       return ( PrecioTotal);
   }
     
     

  public String MostrarDatos(){
      return("NOMBRE: "+this.Nombre+" PRECIO: "+this.Precio+" DIAS A CADUCAR: "+this.DiasCad);
  } 

}