package Department_Store.Items;

public enum Brands {

    FRED_PERRY ("Menswear"),
    RALPH_LAUREN ("Menswear"),
    WAREHOUSE ("Womenswear"),
    DKNY ("Womenswear"),
    VANS ("Footwear"),
    UGG ("Footwear"),
    CLINIQUE ("Beauty"),
    DIOR ("Beauty");

    private String category;

    Brands(String category){
        this.category = category;
    }

    public String getCategoryName(){
        return this.category;
    }

}
