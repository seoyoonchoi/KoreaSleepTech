package chapter07;
/*
final keyword
변수, 메서드, 클래스에서 사용 가능
1) 변수 : 값을 변경할 수 없는 상수를 선언한다
2) 메서드 : 자식 클래스에서 재정의(오버라이드)할 수 없는 메서드 선언
            >>해당 메서드는 재정의 될 수 없다.
3) 클래스 : 상속될 수 없는 클래스 선언

 */
class MyFinalClass{
    /*
    1. final 변수 : 상수를 지정하는 키워드 선언과 동시에 초기화 하기 때문에 재할당이 불가능하다
    -UPPER_SNAKE_CASE(전체 키워드를 대문자로 작성한다.
    final int Final_Variable
     */
    final int FINAL_VARIABLE = 30;
    public final void myMethod(){
        System.out.println("재정의 할 수 없는 메서드");
    }
}

class ChildClass extends MyFinalClass{

}

final class Example1{

}
//class Example2 extends Example1{ }
class StudentClass{
    private String name;
    private final int residentNumber;
    private final String gender;

    StudentClass(int residentNumber, String gender){
        this.residentNumber = residentNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class C_final {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.myMethod();//재정의 할 수 없는 메서드

    }
}
