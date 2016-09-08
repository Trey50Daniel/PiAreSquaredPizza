
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
    public enum PizzaType {CLASSIC, SPECIALTY, CUSTOM, NONE};
    public enum ClassicTypes {PEPPERONI, SAUSAGE, CHEESE, MUSHROOM, NONE };
    public PizzaType myPizzaType;
    private ClassicTypes myClassicType;
    public enum SpecialtyTypes {COMBOCLASSIC, VEGGIELOVER, MEATLOVER, SOUTHWESTERN, HAWAIIAN, CHICKENALFREDO, NONE};
    private SpecialtyTypes mySpecialty;
    public enum CrustType {CHEESESTUFF, THIN, NORMAL};
    public enum pizzaSize {SMALL, MEDIUM, LARGE, XLARGE, NONE};
    public enum Toppings {PEPPERONI, CHEESE, SAUSAGE, MUSHROOM, ANCHOVIES, ONION, PEPPER, BEEF, BBQ, NONE };
    private ArrayList<Toppings> myToppings;
    private boolean isCustom;
    
    private double pizzaPrice = 0;
    private double CrustPrice = 0;
    

    public Pizza() {
        
    }
    
    
    public void setPizza(String pizzaName) {
        switch (pizzaName){
                case "PEPPERONI":
                    myPizzaType = PizzaType.CLASSIC;
                    myClassicType = ClassicTypes.PEPPERONI;
                    mySpecialty = SpecialtyTypes.NONE;
                    isCustom = false;
                    break;
                case "SAUSAGE":
                    myPizzaType = PizzaType.CLASSIC;
                    myClassicType = ClassicTypes.SAUSAGE;
                    mySpecialty = SpecialtyTypes.NONE;
                    isCustom = false;
                    break;
                case "CHEESE":
                    myPizzaType = PizzaType.CLASSIC;
                    myClassicType = ClassicTypes.CHEESE;
                    mySpecialty = SpecialtyTypes.NONE;
                    isCustom = false;
                    break;
                case "MUSHROOM":
                    myPizzaType = PizzaType.CLASSIC;
                    myClassicType = ClassicTypes.MUSHROOM;
                    mySpecialty = SpecialtyTypes.NONE;
                    isCustom = false;
                   break;
                case "COMBOCLASSIC":
                    myPizzaType = PizzaType.SPECIALTY;
                    mySpecialty = SpecialtyTypes.COMBOCLASSIC;
                    myClassicType = ClassicTypes.NONE;
                    isCustom = false;
                    break;
                case "VEGGIELOVER":
                    myPizzaType = PizzaType.SPECIALTY;
                    myClassicType = ClassicTypes.NONE;
                    mySpecialty = SpecialtyTypes.VEGGIELOVER;
                    break;
                case "MEATLOVER":
                    myPizzaType = PizzaType.SPECIALTY;
                    myClassicType = ClassicTypes.NONE;
                    mySpecialty = SpecialtyTypes.MEATLOVER;
                    break;
                case "SOUTHWESTERN":
                    myPizzaType = PizzaType.SPECIALTY;
                    myClassicType = ClassicTypes.NONE;
                    mySpecialty = SpecialtyTypes.SOUTHWESTERN;
                   break;
                 case "HAWAIIAN":
                    myPizzaType = PizzaType.SPECIALTY;
                    myClassicType = ClassicTypes.NONE;
                    mySpecialty = SpecialtyTypes.HAWAIIAN;
                    break;
                case "CHICKENALFREDO":
                    myPizzaType = PizzaType.SPECIALTY;
                    myClassicType = ClassicTypes.NONE;
                    mySpecialty = SpecialtyTypes.CHICKENALFREDO;
                    break;
                default:
                    myClassicType = ClassicTypes.NONE;
                    break;
            }
    }
    
    public void setSize(String pizzaSize) {
        
    }
    
    public void addTopping(String toppingName) {
        if(isCustom) {
            switch(toppingName) {
                case "Pepperoni":
                    myToppings.add(Toppings.PEPPERONI);
                    break;
                case "Sausage":
                    myToppings.add(Toppings.SAUSAGE);
                    break;
                case "BBQ":
                    myToppings.add(Toppings.BBQ);
                    break;
                case "Cheese":
                    myToppings.add(Toppings.CHEESE);
                    break;
                case "Mushroom":
                    myToppings.add(Toppings.MUSHROOM);
                    break;
                case "Anchovies":
                    myToppings.add(Toppings.ANCHOVIES);
                    break;
                case "Onion":
                    myToppings.add(Toppings.ONION);
                    break;
                case "Pepper":
                    myToppings.add(Toppings.PEPPER);
                    break;
                case "Beef":
                    myToppings.add(Toppings.BEEF);
                    break;
            }
        }
    }
    
    public void setPrice() {
        if(myPizzaType == PizzaType.CUSTOM) {
            
        }
    }
    
    public double getPrice(){
        return pizzaPrice;
    }
}


