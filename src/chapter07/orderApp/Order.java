package chapter07.orderApp;

//order class - 실제 주문 로직이 구현된다.
//제품과 수량을 기반으로 주문생성
public class Order {
    private Product product;
    private int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double calculateTotalPrice(){
        double tax = product.calculateTax();
        return (product.getPrice()+tax)*quantity;
    }

    //주문 정보를 반환하는 메서드
    //모든 객체 타입에 존재하는 메서드이며 문자열을 반환한다.
    @Override
    public String toString(){
        return "주문상세정보: 제품명["+product.getName()+"] 수량 ["+quantity+"]"+"\n총 금액은 : "+calculateTotalPrice();
    }
}