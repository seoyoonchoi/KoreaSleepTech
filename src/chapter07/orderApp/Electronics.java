package chapter07.orderApp;

public class Electronics extends Product {

    public Electronics(String name, int price) {
        super(name, price);
    }

    @Override
    double calculateTax(){
        return getPrice()*0.15;
    }//인스턴스 메서드는 해당 클래스 내부에서의 호출도 가능하다.




}
