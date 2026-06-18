package OFOS;

public abstract class MenuItem {
    private String itemId;
    private String name;
    private double basePrice;


    public MenuItem(String itemId, String name, double basePrice) {
        this.itemId = itemId;
        this.name = name;
        this.basePrice = basePrice;

    }
    public String getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
abstract void getCategory();
}
