package Department_Store.Items;

public class Item {

    private ItemSpec spec;
    private double sellPrice;
    private double buyPrice;
    private int stockLevel;

    public Item(ItemSpec spec, double sellPrice, double buyPrice, int stockLevel) {
        this.spec = spec;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.stockLevel = stockLevel;
    }

    public ItemSpec getItemSpec() {
        return spec;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

//    public Product getProduct(){
//        spec.getProduct();
//    }
}
