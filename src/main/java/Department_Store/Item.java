package Department_Store;

public class Item {

//    private ItenmSpec spec;
    private double sellPrice;
    private double buyPrice;
    private int stockLevel;

    public Item(ItemSpec spec, double sellPrice, double buyPrice, int stockLevel) {
//        this.spec = spec;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.stockLevel = stockLevel;
    }

//    public Category getCatgory(){
//        spec.getCategory();
//    }
}
