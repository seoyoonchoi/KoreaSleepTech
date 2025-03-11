package chapter05;

import java.sql.PreparedStatement;

//음식점 클래스
//다양한 방법으로 음식을 주문받는 메서드
class Restaurant{
    //method 정의 : placeOrder()
    //메뉴이름(String dish)
    //메뉴이름*수량제공(int quantity)
    //메뉴이름*특별요청사항(String specialRequests)
    //메뉴이름*수량제공*특별요청사항

    void placeOrder(String dish){
        System.out.println(dish);
    }
    void placeOrder(String dish, int quantity){
        System.out.println(dish+quantity+"개요~");
    }
    void placeOrder(String dish, String specialRequest){
        System.out.println(dish+"-"+specialRequest);
    }
    void placeOrder(String dish, int quantity,String specialRequest){
        System.out.println(dish+quantity+"*"+quantity+"-"+specialRequest);
    }
}

public class G_overloading {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.placeOrder("햄버거");//이건 restaurant보다는 손님 한명당 (혹은 테이블별로) 어떤 주문을 했는지에 관한 인스턴스로 만드는게 효율적일듯
        restaurant.placeOrder("pasta",2);
        restaurant.placeOrder("salad",3,"땅콩빼고");
    }
}
