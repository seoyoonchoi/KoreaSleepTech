package chapter06;

import org.w3c.dom.ls.LSOutput;

//extends(확장하다)라는 키워드를 통하여 구현가능하다.
//class (자식클래스) extends (부모클래스){}
class Parent{//부모클래스(기존클래스)
}
class Child extends Parent{//자식클래스(새로운 클래스)
}

//동물 클래스
class Animal{
    String name;//동물의 이름
}

class Dog extends Animal{
    void bark(){
        System.out.println("강아지가 짖습니다");
    }
}

class TV{
    boolean power;
    int channel;

    void setPower(){
        power = !power;
    }

    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }
}

class SmartTv extends TV{
    boolean ott; //ott 전원 상태를 on/off

    void displayOtt(String platform){
        if(ott){
            System.out.println(platform);
        }else {
            System.out.println("Ott disconnected");
        }
    }
}

public class B_Inheritance {
    public static void main(String[] args) {
        Dog choco = new Dog();
        choco.name = "초코";
        System.out.println(choco.name);
        choco.bark();
        System.out.println("TV-----------------------------TV");

        TV tv1 = new TV();
        tv1.power = true;
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        System.out.println(tv1.channel);

        SmartTv smartTv1 = new SmartTv();
        smartTv1.power = true;
        smartTv1.channelDown();
        smartTv1.channelDown();
        smartTv1.channelDown();
        smartTv1.channelDown();
        smartTv1.channelDown();
        System.out.println(smartTv1.channel);

        smartTv1.displayOtt("netflix");
        smartTv1.ott = true;
        smartTv1.displayOtt("disneyPlus");


    }
}
