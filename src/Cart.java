/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author tagg8
 */
public class Cart {
    //3 pizza , beverage ,xtra
    private ArrayList<Pizza> pizzas;
    private ArrayList<Beverage> beverages;
    private ArrayList<Extra> extras;
    private double totalCost;
    
    public Cart() {
        pizzas = new ArrayList<>();
        beverages = new ArrayList<>();
        extras = new ArrayList<>();
        totalCost = 0;
    }
    
    public void addToCart(Beverage bev) {
        beverages.add(bev);
        totalCost += bev.getPrice();
    }
    
    public void addToCart(Pizza piz) {
        pizzas.add(piz);
        totalCost += piz.getPrice();
    }
    
    public void addToCart(Extra ex) {
        extras.add(ex);
    }
    
    public void clearCart() {
        pizzas = new ArrayList<>();
        beverages = new ArrayList<>();
        extras = new ArrayList<>();
        totalCost = 0;
    }
}
