package chapter08;


//인터페이스
interface Fruit{
    String color();
    default void describe(){
        System.out.println("color"+color()+"shape is round");
    }

    //정적메서드 재정의(오버라이딩)불가능
    static void printType(){
        System.out.println("fruit type");
    }
}

class Apple implements Fruit{
    public String color(){
        return "red";
    }
}

class Orange implements Fruit{
    public String color(){
        return "orange";
    }
}

class Banana implements Fruit{
    public String color(){
        return "yellow";
    }

    @Override
    public void describe(){
        System.out.println("fruit color"+color()+"이며 모양은 깁니다.");
    }
}

//인터페이스 끼리의 확장이 가능하다.
//즉 클래스와 클래스 - 인터페이스와 인터페이스간의 확장은 가능하다.
//cf) 대신 다르면 불가능
//클래스 인터페이스 간에는 implement(구현하다)사용
interface Tropical extends Fruit{
    default void tropicalFeature(){
        System.out.println("열대과일은 후숙하면 더 맛있습니다.");
    }
}

class Mango implements Tropical{

    @Override
    public String color() {
        return "yello";
    }

    @Override
    public void describe() {
        System.out.println("Fruit color is"+color()+"Oval");
    }
}

public class F_Practice {
    public static void main(String[] args) {
        //다형성 적용
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit banana = new Banana();
        Tropical mango = new Mango();


        //업캐스팅 : mango가 Fruit 타입으로 형 변환
        Fruit[] fruits = {apple, orange, banana, mango};
        //>>Tropical이 Fruit를 상속받은 인터페이스

        for(Fruit fruit : fruits){
            fruit. describe();
            //fruit.tropicapFeature();

            if(fruit instanceof Tropical){
                Tropical tropicalFruit = (Tropical) fruit;
                tropicalFruit.tropicalFeature();
            }
        }


        //A instanceof B
        class 동물 {}
        class 고양이 extends 동물{}
        class 강아지 extends 동물{}

        동물 애니멀 = new 동물();
        동물 나비 = new 고양이();
        동물 초코 = new 강아지();

        if(애니멀 instanceof 고양이){
            System.out.println("Execution Failed : 부모 객체는 자식 객체에 절대 담을 수 없다 ");
        }

        Fruit.printType();
        //과일 타입이다. 정적메서드는 인터페이스로 호출가능

    }
}
