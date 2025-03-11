package chapter10.practice02.entity;

public class Electronics extends Item{
    private String brand;
    private int warranty;

    public Electronics(String id, String name, int price, int quantity, String brand, int warranty) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }


    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }

    @Override
    public String toString() {
        return super.toString()+"brand"+brand+", warranty: "+warranty+"months";
    }
}
