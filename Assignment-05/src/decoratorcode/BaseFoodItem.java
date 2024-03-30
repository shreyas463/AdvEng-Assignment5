package decoratorcode;
// the component class for base food items
public class BaseFoodItem implements FoodItem {
    private String name;
    private double price;

    public BaseFoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getCost() {
        return price;
    }
}
