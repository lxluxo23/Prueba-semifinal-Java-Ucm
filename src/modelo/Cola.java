//Jose Ibarra
//Luis Cespedes
package modelo;

import java.util.*;

public class Cola {
    private List <Character>elementos;
    public Cola(){
        this.crear();
    }
    public void crear(){
        this.elementos = new ArrayList<Character>();
    }
    public void encolar(Character elem){
        this.elementos.add(elem);
    }
    public void desencolar(){
        this.elementos.remove(0);
    }
    public Character frente(){
        return this.elementos.get(0);
    }
    public boolean esVacia(){
        return this.elementos.isEmpty();
    }
    public void imprime(){
        for (int i = 0; i < elementos.size(); i++) 
            System.out.print("["+elementos.get(i)+"]");
        System.out.println("");
        
    }
}
