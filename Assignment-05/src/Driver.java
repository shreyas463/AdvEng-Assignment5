import decoratorcode.*;

// Driver program
public class Driver {
    public static void main(String[] args) {
        // Creating the food items
        FoodItem burger = new BaseFoodItem("Fish Burger", 6.0);
        FoodItem fries = new BaseFoodItem("Carne Asada Fries", 2.5);
        FoodItem hotdog = new BaseFoodItem("HotDog", 9.0);

        // Adding different toppings
        FoodItem burgerWithCheese = new AdditionalTopping(burger, "Mozz Cheese", 1.0);
        FoodItem burgerWithBaconAndCheese = new AdditionalTopping(burgerWithCheese, "Bacon", 1.5);
        // Correctly initialize hotdog with toppings
        FoodItem hotdogWithGuac = new AdditionalTopping(hotdog, "Guac", 4.5);
        FoodItem hotdogWithGuacAndPico = new AdditionalTopping(hotdogWithGuac, "Pico de Gallo", 1.5);

//         add a drink with an option like "large size" or an extra shot:
        FoodItem coffee = new BaseFoodItem("Coffee", 2.0);
        FoodItem largeCoffee = new AdditionalTopping(coffee, "Large Size", 0.5);
        FoodItem extraShotCoffee = new AdditionalTopping(largeCoffee, "Extra Shot", 1.0);



        Order order = new Order();
        order.addItem(hotdogWithGuacAndPico);
        order.addItem(burgerWithBaconAndCheese);
        order.addItem(fries);
        order.addItem(coffee);
        order.addItem(largeCoffee);
        order.addItem(extraShotCoffee);

        // Calculate total cost for customers
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before any discount is: $" + totalCost);

        // Apply discount based on loyalty status for customers
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.4); // 40% discount for example
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total cost after applying the discount: $" + discountedCost);
    }
}
