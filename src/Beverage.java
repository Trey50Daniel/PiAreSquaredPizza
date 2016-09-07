
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
    public enum drinkTypes {COKE, PEPSI, SPRIT, DRPEPPER};
    private double drinkPrice = 0;
    private size mySize;
    private drinkTypes myDrinkType;
    
    public Beverage(String bevSize, String drink){
           //  bevSize = mySize;
            switch (bevSize){
                case "LARGE":
                    mySize = size.LARGE;
                    break;
                case "MEDIUM":
                    mySize = size.MEDIUM;
                    break;
                case "":
            }
    }
    
    public void setBevSize(String bevSize) {
        switch (bevSize){
            case "XLARGE":
                mySize = size.XLARGE;
                break;
            case "LARGE":
                mySize = size.LARGE;
                break;
            case "MEDIUM":
                mySize = size.MEDIUM;
                break;
            case "SMALL":
                mySize = size.SMALL;
                break;
        }
    }
    public double getPrice(){
        return drinkPrice;   
   }
}
