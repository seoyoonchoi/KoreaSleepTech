package chapter05;

//오버로딩은 중복 정의한다는 것을 의미한다
//즉 한 클래스 내에서 동일한 이름의 메서드를 여러개 정의하는 것
//cf// 변수는 같은 영역 내에서 동일한 이름의 재선언이 불가능하다.

class Calc{
    int add(int a, int b){
        return a+b;
    }
    int add(short a, short b){
        return a+b;
    }
    double add(double x, double y){
        return x+y;
    }
    double add(int x, double y){
        return x+y;
    }
    double add(double y, int x){
        return x+y;
    }
}

public class F_overloding {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(10,20));
        System.out.println(calc.add(10,20.5));
        System.out.println(calc.add(10.5,20));

    }
}
