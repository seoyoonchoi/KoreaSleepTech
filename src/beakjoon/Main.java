package beakjoon;

import java.util.Scanner;

class Age{
    int age;
    String name;

    public Age(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
//지역변수의 경우에는 자동으로 초기화되지 않으며 초기화없이 사용할 경우 에러가 발생한다.
//인스턴스변수는 각 객체에 속한 변수이며 다른 값을 가질 수 있다.
//클래스 내부에서 선언되며 객체가 생성될 때 메모리에 할당한다.

//클래스(static정적)변수 : 인스턴스가 정적으로 같은 값을 갖는 변수
//ex) 한국사람에 대한 변수를 만드는데 국가명 같은거 걍 다 똑같은류 ㅇㅇ
//즉 클래스의 모든 인스턴스에서 공유되는 데이터 변수
//클래스 변수에서 데이터값이 같아야 하는가?(이건거같음) 아니면 그냥 변수 자체가 공유되는 것인가?
//(인스턴스화 되기 전부터 가장 먼저 만들어진다)
//프로그램이 시작될 때 생성되었다가 프로그램 종료 시 소멸된다.



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Age person = new Age(sc.nextInt(),sc.next());

    }
}


