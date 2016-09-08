
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
    private CrustType myCrust;
    private pizzaSize mySize;
    
    private double xLargePrice = 14.00;
    private double largePrice = 12.00;
    private double mediumPrice = 10.00;
    private double smallPrice = 8.00;
    private double specialtyPrice = 3.75;
    private double classicPrice = 2.75;
    private double toppingPrice = 1.50;
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
                    break;
                case "SAUSAGE":
                    myPizzaType = PizzaType.CLASSIC;
                    myClassicType = ClassicTypes.SAUSAGE;
                    mySpecialty = SpecialtyTypes.NONE;
                    break;
                case "CHEESE":
                    myPizzaType = PizzaType.CLASSIC;
                    myClassicType = ClassicTypes.CHEESE;
                    mySpecialty = SpecialtyTypes.NONE;
                    break;
                case "MUSHROOM":
                   myPizzaType = PizzaType.CLASSIC;
                   myClassicType = ClassicTypes.MUSHROOM;
                   mySpecialty = SpecialtyTypes.NONE;
                   break;
                case "COMBOCLASSIC":
                    myPizzaType = PizzaType.SPECIALTY;
                    mySpecialty = SpecialtyTypes.COMBOCLASSIC;
                    myClassicType = ClassicTypes.NONE;
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
                    mySpecialty = SpecialtyTypes.NONE;
                    myPizzaType = PizzaType.CUSTOM;
                    break;
            }
    }
    
    public void addTopping(String toppingName) {
        if(myPizzaType == PizzaType.CUSTOM) {
            switch(toppingName) {
                case "Pepperoni":
                    myToppings.add(Toppings.PEPPERONI);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Sausage":
                    myToppings.add(Toppings.SAUSAGE);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "BBQ":
                    myToppings.add(Toppings.BBQ);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Cheese":
                    myToppings.add(Toppings.CHEESE);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Mushroom":
                    myToppings.add(Toppings.MUSHROOM);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Anchovies":
                    myToppings.add(Toppings.ANCHOVIES);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Onion":
                    myToppings.add(Toppings.ONION);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Pepper":
                    myToppings.add(Toppings.PEPPER);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
                case "Beef":
                    myToppings.add(Toppings.BEEF);
                    myPizzaType = PizzaType.CUSTOM;
                    break;
            }
        }
    }
    
    public void setSize(String size) {
        switch (size){
            case "XLARGE":
                mySize = pizzaSize.XLARGE;
                break;
            case "LARGE":
                mySize = pizzaSize.LARGE;
                break;
            case "MEDIUM":
                mySize = pizzaSize.MEDIUM;
                break;
            case "SMALL":
                mySize = pizzaSize.SMALL;
                break;
        }
    }
    
    public void calculatePrice() {
        if(myPizzaType == PizzaType.CUSTOM) {
            switch(mySize) {
                case XLARGE:
                    pizzaPrice += xLargePrice;
                    break;
                case LARGE:
                    pizzaPrice += largePrice;
                    break;
                case MEDIUM:
                    pizzaPrice += mediumPrice;
                    break;
                case SMALL:
                    pizzaPrice += smallPrice;
                    break;
            }
            for(int i = 0; i < myToppings.size(); i++) {
                pizzaPrice += toppingPrice;
            }
        }
        else if(myPizzaType == PizzaType.CLASSIC) {
            pizzaPrice += classicPrice;
            switch(mySize) {
                case XLARGE:
                    pizzaPrice += xLargePrice;
                    break;
                case LARGE:
                    pizzaPrice += largePrice;
                    break;
                case MEDIUM:
                    pizzaPrice += mediumPrice;
                    break;
                case SMALL:
                    pizzaPrice += smallPrice;
                    break;
            }
        }
        else {
            pizzaPrice += specialtyPrice;
            switch(mySize) {
                case XLARGE:
                    pizzaPrice += xLargePrice;
                    break;
                case LARGE:
                    pizzaPrice += largePrice;
                    break;
                case MEDIUM:
                    pizzaPrice += mediumPrice;
                    break;
                case SMALL:
                    pizzaPrice += smallPrice;
                    break;
            }
        }
    }
    
    public double getPrice(){
        return pizzaPrice;
    }
}


