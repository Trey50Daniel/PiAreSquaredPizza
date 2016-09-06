
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
    public enum ClassicTypes {PEPPERONI, SAUSAGE, CHEESE, MUSHROOM };
    public enum SpecialtyTypes {ComboClassic, VeggieLover, MeatLover, SouthWestern, Hawaiian, ChickenAlfredo};
    public enum CrustType {CHEESESTUFF, THIN, NORMAL};
    public enum Toppings {PEPPERONI, CHEESE, SAUSAGE, MUSHROOM, ANCHOVIES, ONION, PEPPER, BEEF, BBQ };
    private boolean isCustom;
    private double pizzaPrice = 0;
    private double CrustPrice = 0;
    

    public Pizza() {
        isCustom = false;
    }
    
    public Pizza(String pizza, String crust){
        
    }
    
    public void addTopping() {
        
    }
}


