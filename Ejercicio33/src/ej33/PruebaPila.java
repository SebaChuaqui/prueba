package ej33;

import java.util.ArrayList;

import java.util.List;

public class PruebaPila {
    
    List<Integer> lista = new ArrayList<Integer>();
    
    public void rellenar(List<Integer> lista) {
        
    	for (int n = 1; n <= 10; n++) {
            lista.add(n);
            
        }
        
    }

    public void imprimirYVaciar(List<Integer> lista) {
        
    	lista.stream().forEach(System.out::println);  
        
    }
    
}
