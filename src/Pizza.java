
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
    public enum CrustSize{CHEESESTUFF, THIN, NORMAL};
    private double pizzaPrice = 0;
    private double CrustPrice = 0;
    public boolean custom;
    private ClassicTypes myClassicTypes;
    private CrustSize myCrustSize;
    ArrayList<ClassicPizza> ClassicPizzas = new ArrayList<ClassicPizza>();
  //  public void 
    
    
    public Pizza(ClassicTypes pizza, CrustSize crust){
                pizza = myClassicTypes;
                if(myCrustSize == CrustSize.CHEESESTUFF){
                    CrustPrice = 1.00;
                }
                else if(myCrustSize == CrustSize.THIN){
                    CrustPrice = 00.50;
                }
                else{
                    CrustPrice = 00.25;
                
                }
                if(myClassicTypes == ClassicTypes.ComboClassic){
                   
                }
    
    
    }
}


