package OFOS;

public class NonVegItem extends MenuItem implements Discountable {
    public NonVegItem(String itemId, String name, double basePrice) {
        super(itemId, name, basePrice);
    }

    @Override
    public double applyDiscount(double percent) {
        return 5;
    }

    @Override
    public String getDiscountDescription() {
        return "";
    }

    @Override
    void getCategory() {

    }
}
