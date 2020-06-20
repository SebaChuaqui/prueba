package ej33;

import java.util.ArrayList;

import java.util.List;

	public class Principal {
		
		public static void main(String[] args) {
        
			List<Integer> lista = new ArrayList<Integer>();
        
        PruebaPila pila = new PruebaPila();
        
        pila.rellenar(lista);
        
        pila.imprimirYVaciar(lista);
    }
}