package chapter08;

interface Flayable{
    int AVERAGE_SPEED = 100;
    void fly();

    //default메서드의 경우에는 해당 인터페이스를 구현하는 클래스에서 재정의 가능하다.
    default void land(){
        System.out.println("착륙합니다");
    }
    //static의 경우에는 해당 인터페이스를 구현하는 클래스에서 재정의 불가능
    static int getWingCount(){
        return 2;
    }
}

class 참새 implements Flayable{

    @Override
    public void fly() {
        System.out.println("참새의 속력은 "+AVERAGE_SPEED+"보다 느립니다.");
    }

    @Override
    public void land() {

        System.out.println("사뿐");
    }
}

class 독수리 implements Flayable{
    @Override
    public void fly() {
        System.out.println("독수리 속력은 "+AVERAGE_SPEED+"보다 빠릅니다");
    }

    @Override
    public void land(){
        System.out.println("슈우웅");
    }

}

public class C_Interface {
    public static void main(String[] args) {

        참새 bird1 = new 참새();
        bird1.fly();
        bird1.land();

        독수리 bird2 = new 독수리();

        bird2.fly();
        bird2.land();

    }
}
