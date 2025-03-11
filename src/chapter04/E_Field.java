package chapter04;

class CarClass{
    String brand;
    String color;
    int speed;

    static int tire = 4;
    static int door;

    void accel(int increase){
        speed += increase;
        //스피드는 필드이고 이는 지역변수 내에서도 접근 가능하고, increment는 지역변수이고, 메서드 내부에서만 유효하다.

    }

    }

public class E_Field {
    public static void main(String[] args) {
        System.out.println(CarClass.tire);
        System.out.println(CarClass.door);

        CarClass ko = new CarClass();
        CarClass eun = new CarClass();
        CarClass sung = new CarClass();

        ko.brand = "cyrano";
        ko.color = "red";

        ko.accel(911);
        System.out.println("speed : "+ko.speed);

        System.out.println(eun.door);




    }
}