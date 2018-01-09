package Department_Store;

public class Item {

    private String category;
    private String brand;
    private String product;
    private double sellPrice;
    private double buyPrice;
    private int stockLevel;

    public Item(String category, String brand, String product, double sellPrice, double buyPrice, int stockLevel) {
        this.category = category;
        this.brand = brand;
        this.product = product;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.stockLevel = stockLevel;
    }
}
