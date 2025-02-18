package View;

import Controller.RestoController;

public class RestoPrincipal {
    
    public static void main (String args[]){
        
        RestoController sc = new RestoController();
        
        int dividendo = 5;
        int divisor = 2;
        
        int resto = sc.restoDivisao(dividendo, divisor);
        
        System.out.println("O RESTO DA DIVISÃO DE " + dividendo + "/" + divisor + " É: " + resto + ".");
        
    }
    
}
