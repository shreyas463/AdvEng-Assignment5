package decoratorcode;

import decoratorcode.FoodItem;

import java.util.ArrayList;
import java.util.List;

// Class representing customer's order
public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (FoodItem item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}
