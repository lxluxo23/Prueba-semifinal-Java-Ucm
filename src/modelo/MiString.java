//Jose Ibarra
//Luis Cespedes
package modelo;

public class MiString {
    int abre=0,cierra=0;
    private String frase;

    public MiString(String frase) {
        this.frase = frase;
    }
    public void set(String frase){
        this.frase=frase;
    }

    public boolean validar(){
        Pila p1 = new Pila();
        
  
        this.frase = this.frase.replace(" ", "");
        for (int i = 0; i < this.frase.length(); i++) {
            char letra = this.frase.charAt(i);
            p1.push(letra);
            if (letra=='('){
                abre++;
            }
            else{
                cierra++;
            }
            
        }
      
        //p1.imprime();
        if (abre==cierra){
            p1.imprime();
            System.out.println("Esta equilibrado");
            return true;
        }
        else{
            p1.imprime();
            System.out.println("Esta desequilibrado");
            return false;
        }
        
  
    }

    
    

}
