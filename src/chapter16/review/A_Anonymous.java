package chapter16;

interface Animal{
    void sound();
}

class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

abstract class Vehicle{
    abstract void run();
    //추상메서드는 abstract 키워드 생략이 불가능하다.
}


public class A_Anonymous {
    public static void main(String[] args) {

       Vehicle car = new Vehicle() {
           @Override
           void run() {
               System.out.println("car run");
           }
       };
       car.run();

    }
}
