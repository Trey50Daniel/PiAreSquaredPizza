
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
    private double drinkPrice = 0;
    private size mySize;
    ArrayList<Beverage> beverages = new ArrayList<Beverage>();
    
    public void addBeverage(Beverage beverage){
            beverages.add(beverage);
    }
    Beverage(size bevSize){
             bevSize = mySize;
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
