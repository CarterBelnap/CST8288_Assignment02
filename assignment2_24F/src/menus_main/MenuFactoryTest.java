/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus_main;
import menu_building.*;
import menus.*;

/**
 *
 * @author Carter Belnap
 * 
 */
public class MenuFactoryTest {

public static void main(String[] args) {
        
        MenuBuilding theBuilding = new ConcreteMenuBuilding();
        String dashLine = "=======================================";
        
        System.out.println(dashLine);
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        System.out.println(theFallMenu);
        
        System.out.println(dashLine);
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);
        
        System.out.println(dashLine);
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu);
         
        System.out.println(dashLine);
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
        
    }    
}
