package chapter05;
class Operator{
    int a,b;
    int add(){
        return a+b;
    }
    static int substract(int a,int b){
        //int result = this.a-this.b;
        return a-b;
    }

    int multiply(int a, int b){
        int result = this.a-this.b;
        return result;
    }



}

public class C_Method {
    public static void main(String[] args) {
        System.out.println("인스턴스 메서드");
        Operator operator = new Operator();

        operator.a=10;
        operator.b = 20;
        System.out.println(operator.add());

        System.out.println("정적 메서드");
        int result = Operator.substract(10,20);
        System.out.println(result);
    }
}
