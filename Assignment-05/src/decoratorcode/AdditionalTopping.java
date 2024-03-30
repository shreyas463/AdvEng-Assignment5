package decoratorcode;


public class AdditionalTopping extends ToppingDecorator {
    private String toppingName;
    private double toppingPrice;

    public AdditionalTopping(FoodItem foodItem, String toppingName, double toppingPrice) {
        super(foodItem);
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double getCost() {
        return super.getCost() + toppingPrice;
    }
}
