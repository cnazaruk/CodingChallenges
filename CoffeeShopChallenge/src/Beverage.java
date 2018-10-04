
public class Beverage {
private float price;
private String type;

    public Beverage(float price, String type) {
        this.price = price;
        this.type = type;
    }

    public float getCost() {
        return this.price;
    }

    public String getDescription() {
        return this.type;
    }

    public static void main(String[] args) {
        Billing.processOrder("4 x regular + sugar, 13 x decaf + sprinkles, 24 x xigua, 3 x regular,");
    }

}