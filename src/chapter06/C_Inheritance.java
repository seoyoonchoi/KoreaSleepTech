package chapter06;

class A{
    A(){
    }
    A(int a){
        this();
        System.out.println(a);
    }
}

/*
Mammal(포유류) 클래스
1) 필드 : 이름(name), 나이(age)
2)생성자 : 매개변수가 없는 생성자, 매개변수가 있는 생성자(String name) - 이건 오버로딩임
3)메서드 : 클래스 필드 정보를 출력하다(displayMammal)
 */

class Mammal{
    String name = "Parents";
    int age;

    Mammal(){
        System.out.println("vacant parent constructor - make instancce");
    }

    Mammal(String name){
        this.name=name;
    }

    void displayMammal(){
        System.out.println(name);

        //해당 클래스가 가진 인스턴스 변수에 접근하는 명령어는 this인데, 지역변수와 충돌나지 않는 경우에는 생략가능하다
        //부모클래스가 가진 인스턴스 변수에 접근하는 변수에 접근하는 명령어는 super인데 이는 생략이 불가능하다.

    }
}
//default class 는 같은 패키지 내에서는 모두 접근 가능하다. 그래서 동일한 클래스명을 쓸 수는 없다.

//접근제어자가 생략되어 있는 default class의 경우 같은 패키지 내에서 접근이 가능하기 대문에 같은 패키지 내에 같은 클래스명 사용이 불가능하다


//중복된 이름으로는 클래스명을 만들 수 없다.
//private, public, private, default클래스가 있다.

class Cat extends Mammal{
    String name = "Child";
    Cat(String name) {
        super(name);
        //this.name = name;//위에 있는 부모클래스의 생성자를 그대로 받아오야 한다.
        //super은 부모클래스의 생성자를 가져오는 키워드이며 부모 클래스 내에 정의된 생성자 형태 그대로를 사용한다
        //>>여러개의 생성자가 있는 경우(오버로딩) super의 형태도 다양할 수 있다.
    }

//    Cat(){
//        System.out.println("vacant child constructor - make instance");
//    }


    void displayCat(){
        System.out.println("이름: "+name);
        System.out.println("부모이름"+super.name);
    }
}
//super : 부모 클래스로 생성된 객체 그 자체이며 부모 클래스 내의 필드와 메서드에 접근 가능하다(연산자)
//super. 필드명 / super.메서드명()
//super(); : 부모 클래스 내의 생성자를 호출

public class C_Inheritance {
    public static void main(String[] args) {
//        Cat neco = new Cat("neco");
//        neco.displayCat();
        Cat cat2 = new Cat("나비");
        cat2.displayCat();
        cat2.displayMammal();
    }

}
