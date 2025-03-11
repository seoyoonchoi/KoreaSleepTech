package chapter07.orderApp;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Product elec = new Electronics("TV",1000000);
        Product bread = new Food("빵",1000);

        //주문 생성
        Order order1 = new Order(elec,1);
        Order order2 = new Order(bread,10);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println("-------------------------------");

        //cf)toString()
        //"클래스명@해당 객체의 주소값"이 문자열로 출력된다
        //객체를 문자열로 표현할 때 사용한다.(재정의하여 사용자 편의 문자 출력이 가능하다)
        //모든 클래스의 최상위 클래스인 Object클래스에 정의된다

        System.out.println(order1.toString());
        System.out.println(order2.toString());


    }
}
