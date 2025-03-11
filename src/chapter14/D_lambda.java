package chapter14;

//lambda(표현식 - lambda Expression)---


//람다식 사용 예제
/*
1) 기본표현 : 여러 개의 매개변수 하나의 실행문
 */
interface Calculator{
    int add(int a, int b);
}

/*
[접근제어자] 반환타입 메서드명(매개변수) {
 		구현부
 };




 (params) -> { 구현부(실행문) };
 */

@FunctionalInterface
interface MyFunctionalInterface{
    void doSomething();

}

public class D_lambda {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println("anonymous class result"+calculator1.add(3,5));

        Calculator calculator2 = (a,b) ->(a+b);
        //람다식의 경우 구현부가 한줄일때 {} 생략 가능 >>return 까지 생략이 가능하다 값은 반환이 곧바로 된다.

        Calculator calculator3 = (a,b)->{
            int result = a+b;
            return result;
            //여러줄 구현이면 코드블럭{} 생략 불가 반환값이 있는 경우 return 키워드 사용가능

        };


    }
}


