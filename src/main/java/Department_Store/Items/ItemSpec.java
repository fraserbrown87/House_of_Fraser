package Department_Store.Items;

public class ItemSpec {
    private Brands brand;
    private String product;

    public ItemSpec(Brands brands, String product){
        this.brand = brands;
        this.product = product;
    }

    public Brands getBrandName(){
        return brand;
    }

    public String getProductName() {
        return product;
    }
}
