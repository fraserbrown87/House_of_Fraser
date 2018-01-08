package Department_Store;

public enum OpeningHours {

    MONDAY (900, 1800),
    TUESDAY (900, 1800),
    WEDNESDAY (900, 1800),
    THURSDAY (900, 1900),
    FRIDAY (900, 1800),
    SATURDAY (900, 1800),
    SUNDAY (1100, 1730);

    private int openingTime;
    private int closingTime;

    OpeningHours(int openingTime, int closingTime){
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public int getOpeningTime(){
        return this.openingTime;
    }

    public int getClosingTime(){
        return this.closingTime;
    }


}
