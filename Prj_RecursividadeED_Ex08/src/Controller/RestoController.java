package Controller;

public class RestoController {
    
    public RestoController(){
        
        super();
    }
    
    public int restoDivisao(int dividendo, int divisor){
        
        if(dividendo > divisor){
            
            dividendo = dividendo - divisor;
            
            return restoDivisao(dividendo, divisor);
            
        } else {
            
            return dividendo;
        }
    }
}
