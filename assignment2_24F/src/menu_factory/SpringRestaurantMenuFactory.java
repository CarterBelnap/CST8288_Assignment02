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
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        
        return new SpringDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        
         return new SpringMainCourse();
    }

    @Override    
    public Entree createEntree() {
       
         return new SpringEntree();
    }

    @Override    
    public Dessert createDessert() {
       
        return new SpringDessert();
    } 
}
