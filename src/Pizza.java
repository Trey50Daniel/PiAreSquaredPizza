
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tagg8
 */
public class Pizza {
    public enum ClassicTypes {ComboClassic, VeggieLover, MeatLover, SouthWestern, Hawaiian, ChickenAlfredo };
    public enum CrustType{CHEESESTUFF, THIN, NORMAL};
    private double pizzaPrice = 0;
    private double CrustPrice = 0;
    private ClassicTypes myClassicTypes;
    private CrustType myCrustSize;
    ArrayList<Pizza> ClassicPizzas = new ArrayList<Pizza>();
    
    public Pizza() {
        
    }
    
    public Pizza(ClassicTypes pizza, CrustType crust){
                pizza = myClassicTypes;
                if(myCrustSize == CrustType.CHEESESTUFF){
                    CrustPrice = 1.00;
                }
                else if(myCrustSize == CrustType.THIN){
                    CrustPrice = 00.50;
                }
                else{
                    CrustPrice = 00.25;
                
                }
                if(myClassicTypes == ClassicTypes.ComboClassic){
                   
                }
    
    
    }
}
