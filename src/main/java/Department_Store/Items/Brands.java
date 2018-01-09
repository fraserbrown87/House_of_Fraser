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

    private String department;

    Brands(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

}
