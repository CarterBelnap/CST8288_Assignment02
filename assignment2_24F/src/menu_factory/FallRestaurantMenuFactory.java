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
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        
        return new FallDrink();
    }
    
    @Override
    public MainCourse createMainCourse() {
        
         return new FallMainCourse();
    }

    @Override    
    public Entree createEntree() {
        
         return new FallEntree();
    }

    @Override    
    public Dessert createDessert() {
        
        return new FallDessert();
    }    
}
