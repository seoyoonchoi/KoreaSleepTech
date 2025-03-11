package chapter04;

//클래스 변수vs 인스턴스 변수
//형태 : 클래스 변수( static)
class Example{
    int instanceValue;
    static int classvalue;
}

class Counter{
    static int count = 0;
    Counter(){
        count++;
    }
}

public class F_Field {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        System.out.println(c3.count);
        new Counter();


    }
}
