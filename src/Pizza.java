
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
public final class Pizza {
    public enum ClassicTypes {PEPPERONI, SAUSAGE, CHEESE, MUSHROOM, NONE };
    private ClassicTypes myClassicTypes;
    public enum SpecialtyTypes {COMBOCLASSIC, VEGGIELOVER, MEATLOVER, SOUTHWESTERN, HAWAIIAN, CHICKENALFREDO, NONE};
    private SpecialtyTypes mySpecialty;
    public enum CrustType {CHEESESTUFF, THIN, NORMAL};
    public enum pizzaSize {SMALL, MEDIUM, LARGE, XLARGE, NONE};
    public enum Toppings {PEPPERONI, CHEESE, SAUSAGE, MUSHROOM, ANCHOVIES, ONION, PEPPER, BEEF, BBQ };
    private boolean isCustom;
    
    private double pizzaPrice = 0;
    private double CrustPrice = 0;
    

    public Pizza() {
        isCustom = false;
    }
    
    public Pizza(String pizza, String pizzaSize, String crust){
        switch (pizza){
                case "PEPPERONI":
                     myClassicTypes = ClassicTypes.PEPPERONI;
                     getPizza(pizza);
                    break;
                case "SAUSAGE":
                    myClassicTypes = ClassicTypes.SAUSAGE;
                    break;
                case "CHEESE":
                    myClassicTypes = ClassicTypes.CHEESE;
                    break;
                case "MUSHROOM":
                    myClassicTypes = ClassicTypes.MUSHROOM;
                   break;
                case "COMBOCLASSIC":
                     mySpecialty = SpecialtyTypes.COMBOCLASSIC;
                     getPizza(pizza);
                    break;
                case "VEGGIELOVER":
                    myClassicTypes = ClassicTypes.SAUSAGE;
                    break;
                case "MEATLOVER":
                    myClassicTypes = ClassicTypes.CHEESE;
                    break;
                case "SOUTHWESTERN":
                    myClassicTypes = ClassicTypes.MUSHROOM;
                   break;
                 case "HAWAIIAN":
                     myClassicTypes = ClassicTypes.PEPPERONI;
                     getPizza(pizza);
                    break;
                case "CHICKENALFREDO":
                    myClassicTypes = ClassicTypes.SAUSAGE;
                    break;
                
                default:
                     myClassicTypes = ClassicTypes.NONE;
                    break;
            }
    }
    public Pizza(String pizza, String crust){
        
    }
    
    public void addTopping() {
        
    }
    public String getPizza(String pizza){
       return pizza;
    }
}


