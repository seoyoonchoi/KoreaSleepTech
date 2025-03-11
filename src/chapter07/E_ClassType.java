package chapter07;


class Parent{
    void displayInfo(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    @Override
    void displayInfo(){
        System.out.println("child class");
    }
    void childMethod(){
        System.out.println("only child class");
    }
}
public class E_ClassType {
    public static void main(String[] args) {
        Parent childObject = new Child();
        childObject.displayInfo();
        Child childObjet2 = new Child();
        childObjet2.displayInfo();
        childObjet2.childMethod();

        //부모 클래스 객체변수 = 자식객체변수;
        Parent parentObject = childObjet2;//upcasting
        parentObject.displayInfo();
        //parentObject.childMethod();
        //자식타입 객체변수 = (자식타입) 부모객체;
        System.out.println("=============");
        Child child = (Child)parentObject;
        child.displayInfo();
        child.childMethod();



    }
}
