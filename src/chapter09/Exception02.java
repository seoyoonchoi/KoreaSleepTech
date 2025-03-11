package chapter09;

public class Exception02 {
    public static void main(String[] args) {
        //char c1 = 'abc';
        //위 식은 컴파일 예외에 해당한다.

        String s1 = "String";
        //System.out.println(a1);
        //존재하지 않기 때문에 무조건 컴파일 예외가 발생한다.

        //int division = 10/10 : runtime error
        try {
            //예외 발생 가능성 코드 작성
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            //예외 변수명이 e이고 예외를 매개변수로 자동전달받음
            System.out.println(e.getMessage());
            System.out.println("0으로 정수를 나눌 수 없습니다.");
        }
        //이 구문을 써주면 에러가 발생하지 않고도 실행을 할 수 있다.(예외처리를 통한 정상실행)
        System.out.println("다중 catch 블록 실행");
        try{
            System.out.println("정상실행 1");
            //int division = 10/0;
            System.out.println("위에꺼 실행되면 실행안됨");

            int[] numbers = new int[5];
            //new int [배열의 크기]
            numbers[10] = 50;//변수명[indexNumber]

            String text = null;
            System.out.println(text.length());
            //문자열.length(): 문자열 길이 반환

        }catch (ArithmeticException e){
            System.out.println("수학공식 에러"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열인덱스 초과 에러: "+e.getMessage());
        }catch(NullPointerException e){
            System.out.println("null값 계산 에러: "+e.getMessage());
        }catch (Exception e) {
            System.out.println("초과오류 발생" + e.getMessage());
            //cf)Exception클래스 : 자바 전체 예외의 최상위 클래스
            //예기치 못한 예외 발생 방지를 위해 세부적인 예외 작성의 마지막에 첨부

        }finally {
            //cf)예외 발생 여부와 상관없이 항상 실행되는 코드 블럭
            System.out.println("finally block 실행");
        }
    }
}

