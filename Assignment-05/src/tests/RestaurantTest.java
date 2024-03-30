package tests;

import decoratorcode.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

    @Test
    public void testBaseFoodItem() {
        FoodItem burger = new BaseFoodItem("Fish Burger", 6.0);
        assertEquals(6.0, burger.getCost(), 0.02);
    }


    @Test
    public void testAdditionalTopping() {
        FoodItem burger = new BaseFoodItem("Fish Burger", 6.0);
        FoodItem burgerWithCheese = new AdditionalTopping(burger, "Mozz Cheese", 1.0);
        assertEquals(7.0, burgerWithCheese.getCost(), 0.02);
    }

    @Test
    public void testHotdogWithToppings() {
        FoodItem hotdog = new BaseFoodItem("HotDog", 9.0);
        FoodItem hotdogWithGuac = new AdditionalTopping(hotdog, "Guac", 4.5);
        FoodItem hotdogWithGuacAndPico = new AdditionalTopping(hotdogWithGuac, "Pico de Gallo", 1.5);

        assertEquals(15.0, hotdogWithGuacAndPico.getCost(), 0.02);
    }

    @Test
    public void testDrinkWithOptions() {
        FoodItem coffee = new BaseFoodItem("Coffee", 2.0);
        FoodItem largeCoffee = new AdditionalTopping(coffee, "Large Size", 0.5);
        FoodItem extraShotCoffee = new AdditionalTopping(largeCoffee, "Extra Shot", 1.0);

        assertEquals(3.5, extraShotCoffee.getCost(), 0.02);
    }

    @Test
    public void testLargeCoffee() {
        FoodItem coffee = new BaseFoodItem("Coffee", 2.0);
        FoodItem largeCoffee = new AdditionalTopping(coffee, "Large Size", 0.5);
        assertEquals(2.5, largeCoffee.getCost(), 0.02);
    }

    @Test
    public void testExtraShotCoffee() {
        FoodItem coffee = new BaseFoodItem("Coffee", 2.0);
        FoodItem largeCoffee = new AdditionalTopping(coffee, "Large Size", 0.5);
        FoodItem extraShotCoffee = new AdditionalTopping(largeCoffee, "Extra Shot", 1.0);
        assertEquals(3.5, extraShotCoffee.getCost(), 0.02);
    }



    @Test
    public void testOrder() {
        Order order = new Order();
        FoodItem burger = new BaseFoodItem("Fish Burger", 6.0);
        FoodItem fries = new BaseFoodItem("Carne Asada Fries", 2.5);
        order.addItem(burger);
        order.addItem(fries);
        assertEquals(8.5, order.calculateTotalCost(), 0.02);
    }


    @Test
    public void testLoyaltyStatus() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.4);
        assertEquals(60.0, loyaltyStatus.applyDiscount(100.0), 0.02);
    }
}
