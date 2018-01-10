package Customer;

import Department_Store.Items.Item;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private double wallet;
    private ArrayList<Item> basket;
    private ArrayList<PaymentMethod> paymentOption;

    public Customer(String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = wallet;
        this.basket = new ArrayList<Item>();
        this.paymentOption = new ArrayList<PaymentMethod>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerWallet() {
        return wallet;
    }

    public void setCustomerWallet(double customerWallet) {
        this.wallet = customerWallet;
    }

    public int getBasketItemCount() {
        return basket.size();
    }

    public void addItemToBasket(Item item){
        this.basket.add(item);
    }

    public void removeItemFromBasket(Item item) {
        this.basket.remove(item);
    }
}
