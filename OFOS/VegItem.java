package OFOS;

public class VegItem extends MenuItem implements Discountable {
    public VegItem(String itemId, String name, double basePrice) {
        super(itemId, name, basePrice);
    }

    @Override
    public double applyDiscount(double percent) {
        return 10;
    }

    @Override
    public String getDiscountDescription() {
        return "";
    }

    @Override
    void getCategory() {

    }
}
