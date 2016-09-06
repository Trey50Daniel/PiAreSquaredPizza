
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
    Cart myCart = new Cart();
    public enum size {SMALL, MEDIUM, LARGE, XLARGE};
    public enum drinkTypes {COKE, PEPSI, SPRIT, DRPEPPER};
    private double drinkPrice = 0;
    private size mySize;
    private drinkTypes myDrinkTypes;
    
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
           
           
           
           
           if(mySize == size.LARGE){
                drinkPrice += drinkPrice * 2.50;
            }
            else if(mySize == size.MEDIUM){
                drinkPrice += drinkPrice * 2.25;
            }
            else{
                drinkPrice += drinkPrice * 2.10;
            }
    }
    public double getPrice(){
        return drinkPrice;   
   }
   ArrayList<Beverage>getBeverages(){
       return beverages;
   }
}
