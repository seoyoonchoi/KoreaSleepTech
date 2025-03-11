package chapter04.objects;

public class Main {
    public static void main(String[] args) {
        Coffee hail_le = new Coffee();
        hail_le.categories = "icedAmericano";
        hail_le.price = 4500;
        hail_le.inventory = 65;
        hail_le.temp = 0;

        Coffee hail_le1 = new Coffee("latte",5000,50,90);
        //클래스명 객체명 = new 클래스명(설정값1, 설정값2...);

        //객체명.메서드명(변수값);
        hail_le.priceSetting(2300);//2300의 수익을 내고 싶을 때
        hail_le.manageInventory(3);//3잔 팔았을 때
        hail_le.displayInfo();
        hail_le1.displayInfo();


    }
}
