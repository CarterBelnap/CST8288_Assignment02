/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import menu_factory.RestaurantMenuFactory;
import components.*;

/**
 *
 * @author gouraya
 */
public class SpringRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;
    
    public SpringRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    @Override
    public void populateMenu() {
    	System.out.println("Adding items to " + getName() + "\n");
        
        Entree entree = theFactory.createEntree();
        MainCourse mainCourse = theFactory.createMainCourse();
        Dessert dessert = theFactory.createDessert();
        Drink drink = theFactory.createDrink();
        
        System.out.println("The Spring Menu");
        System.out.println("Active: March 1st to May 31st.\n");
        System.out.println(entree);
        System.out.println(mainCourse);
        System.out.println(dessert);
        System.out.println(drink);
    }    
}
