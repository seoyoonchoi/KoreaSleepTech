package chapter08;

interface Example1{
    int EXAMPLE_VARIABLE = 10;
    void printVar1();
    default void method(){
        System.out.println("예시1");
    }
}

interface Example2{
    void printVar1();
    void printVar2();
    default void method(){
        System.out.println("예시2");
    }
}

//여러개의 인터페이스를 구현하는 클래스
//implements 키워드 뒤에 여러개의 인터페이스를 ,로 구분하여 나열한다.
class ExampleClass implements Example1,Example2{

    //다중 구현의 인터페이스에서 동일한 추상 메서드명을 가져도 가능하다.

    @Override
    public void printVar1() {
        System.out.println(EXAMPLE_VARIABLE);
    }

    @Override
    public void printVar2() {
        System.out.println("다중인터페이스 구현");
    }

    //다중 인터페이스 구현 시 같은 시그니쳐를 가진 디폴트 메서드가 존재할 경우
    //반드시 오버라이드 어노테이션을 작성하자.
    @Override
    public void method() {
        System.out.println("Method 중복되는 디폴트 메서드");
    }
}

public class D_Interface {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.printVar1();
        exampleClass.printVar2();
        exampleClass.method();

        Example1 example1 = exampleClass;
        example1.printVar1();
        //example1.printVar2(); - example1에 정의되지 않음

        example1.method();

        /*
        cf)interface의 다형성
        : 인터페이스로 구현한 클래스의 객체는 해당 인터페이스의 타입으로 동작 가능
        >>업캐스팅의 일부
        -> 해당 인터페이스 내의 구조만 가짐 따라서 추가 구현된 기능은 읽히지 않는다.
        재정의된 메서드는 유지된다.
         */

    }
}
