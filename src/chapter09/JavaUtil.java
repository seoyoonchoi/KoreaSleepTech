package chapter09;

import java.util.Random;

public class JavaUtil {
    public static void main(String[] args) {
        //랜덤 값 생성
        Random random = new Random();//랜덤 객체 생성
        int num = random.nextInt();
        System.out.println(num);//무작위 정수값 출력

        int num1 = random.nextInt(100);
        //()안에 들어가는 숫자는 bound를 의미
        //0부터 해당 인자값 사이의 난수 생성
        System.out.println(num1);

        int num2 = random.nextInt(100,200);
        //int 변수명 = random.nextInt(숫자1, 숫자2)
        //숫자 1부터 숫자 2까지의 수 중에서 랜덤한 숫자.
        System.out.println(num2);


    }
}
