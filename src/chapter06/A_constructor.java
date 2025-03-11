package chapter06;
import java.util.ArrayList;

class Example1{
    int value;
}


//사용자 정의 생성자 : 컴파일러가 자동으로 기본생성자를 제거해버린다.
class Example2{
    int value;
    public Example2(int value){
        this.value = value;
    }
}

class Car{
    String color;
    String gearType;
    int door;

    public Car(){
    }//기본생성자 - 차를 생성한 뒤 필드값 초기화
    //사용자 정의 생성자

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    void displayInfo(){
        System.out.println(color+gearType+door);
    }
}

public class A_constructor {
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Example2 example2 = new Example2(50);


        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("white", "manual", 2)); // car2 추가
        carList.add(new Car("black", "automatic", 4));
        carList.get(0).displayInfo();
    }
}
