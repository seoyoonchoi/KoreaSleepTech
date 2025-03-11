package chapter04;

public class Z_Reference {
    public static void main(String[] args) {
        //참조자료형
        //heap 메모리의 주소를 변수에 담는 자료형 (heap memory에는 데이터값이 저장된다.)
        int[] numbers = {1,2,3};
        System.out.println(numbers);

        String[] strings = {"hi"};
        System.out.println(strings);

        String str = "hello";
        System.out.println(str);

        Object object = "Hello";

    }
}
