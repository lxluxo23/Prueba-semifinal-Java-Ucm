package control;

import modelo.MiString;

public class ejecutor {

    public static void main(String[] args) {
        
        MiString v1 = new MiString("(())");
        
        v1.validar();
        v1.set("(");
        v1.validar();

        
        

    }
    
     

}
