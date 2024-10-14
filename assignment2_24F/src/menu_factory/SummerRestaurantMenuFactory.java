/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.*;


/**
 *
 * @author gouraya
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {
   
    @Override
    public Drink createDrink() {
        
        return new SummerDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        
         return new SummerMainCourse();
    }

    @Override    
    public Entree createEntree() {
        
         return new SummerEntree();
    }

    @Override    
    public Dessert createDessert() {
        
        return new SummerDessert();
    }
    
}
