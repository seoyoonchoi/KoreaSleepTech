package chapter05;

class Calculator{
    int a,b;
    int add(int a, int b){
        return a+b;
    }

    void voidMethod(){
        return;
    }
}

public class A_Method {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3,5));
    }
}
