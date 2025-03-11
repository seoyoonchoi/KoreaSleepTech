package chapter07.orderApp;

public class Food extends Product{

    public Food(String name, int price) {
        super(name, price);
    }

    @Override
    double calculateTax(){
        return 0;
    }


}
