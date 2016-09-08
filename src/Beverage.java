
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
public class Beverage {
    public enum size {SMALL, MEDIUM, LARGE, XLARGE};
    public enum drinkTypes {COKE, PEPSI, SPRITE, DRPEPPER};
    private double drinkPrice = 0;
    private size mySize;
    private drinkTypes myDrinkType;
    
    public Beverage(){
        
    }
    
    public void setDrinkType(String drinkType) {
        switch (drinkType){
            case "Coke":
                myDrinkType = drinkTypes.COKE;
                break;
            case "Dr. Pepper":
                myDrinkType = drinkTypes.DRPEPPER;
                break;
            case "Pepsi":
                myDrinkType = drinkTypes.PEPSI;
                break;
            case "Sprite":
                myDrinkType = drinkTypes.SPRITE;
                break;
        }
    }
    
    public void setBevSize(String bevSize) {
        switch (bevSize){
            case "XLARGE":
                mySize = size.XLARGE;
                drinkPrice = 4.0;
                break;
            case "LARGE":
                mySize = size.LARGE;
                drinkPrice = 3.25;
                break;
            case "MEDIUM":
                mySize = size.MEDIUM;
                drinkPrice = 2.25;
                break;
            case "SMALL":
                mySize = size.SMALL;
                drinkPrice = 1.75;
                break;
        }
    }
    public double getPrice(){
        return drinkPrice;   
   }
}
