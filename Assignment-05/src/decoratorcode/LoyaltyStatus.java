package decoratorcode;
// Class to represent  customer's loyalty status
public class LoyaltyStatus {
    private double discountRate;

    public LoyaltyStatus(double discountRate) {
        this.discountRate = discountRate;
    }

    public double applyDiscount(double totalCost) {
        return totalCost * (1 - discountRate);
    }
}
