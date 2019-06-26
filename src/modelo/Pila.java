//Jose Ibarra
//Luis Cespedes
package modelo;

import java.util.*;

public class Pila {
 private List <Character> elementos;
 
    public Pila(){
        this.crear();
    }
    public void crear(){
        this.elementos = new ArrayList<Character>();
    }
    public void push(Character elem){
        this.elementos.add(elem);
    }
    public void pop(){
        this.elementos.remove(this.elementos.size()-1);
    }
    public Character top(){
        return this.elementos.get(this.elementos.size()-1);
    }
    public boolean isEmpty(){
        return this.elementos.isEmpty();
    }
    
    public void imprime(){
        for (int i = 0; i < elementos.size(); i++) 
            System.out.print("["+elementos.get(i)+"]");
        System.out.println("");
        
    }
}
