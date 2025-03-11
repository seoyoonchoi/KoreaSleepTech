package test;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class JavaTest_최서윤 {
    public static void main(String[] args) {


    /*
    1. 서술형
    기본 데이터타입은 기본 데이터를 저장하는 데이터 타입이다. 주로 정수나 실수 등을 저장할 때 사용된다.
    종류 :  short int long double float 등이 있다.
    예시 : int a = 3;
    2. 참조 데이터 타입
    주소값을 저장하는 데이터 타입이다. 주소값이 저장된다.
    종류 : 배열에서 번지수를 지정하는 데이터 타입
    예시 :
     */

        //2. 코드 구현 문제

        int num1 = 10;
        double num2 = 3.5;
        double result = num1 + num2;
        System.out.println(result);

        //3. 코드 구현 문제
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }else{
            System.out.println("입력하신 숫자는 홀수입니다.");
        }

        //4. 코드 구현 문제
        int[] numbers = {1,2,3,4,5};
        for(int num : numbers){
            System.out.println(num);
        }

        //5. 코드 구현 문제
        ArrayList<Student> studentList = new ArrayList<>();
        /*
        studentList.add("John",85);
        studentList.add("Jane",92);
        studentList.add("Tom",78);
        studentList.add("Emily",88);
        studentList.add("Alex",95);

        for(Student stu : studentList){
        if(student.getScore()>=90){
        System.out.println(studentList);
        }}

        이런.. 식으로 구현을 해야할거같긴 한데 계속 오류가 떠서,,, 좀 더 점검해볼게요


         */




        //6. 단답형 : Object

        //7.length

        //8.case문

        //9.4

        //10.2

        //11.Child

        //12.1

        //13.2

        //14.Dog이 Animal의 자식클래스여야 한다.

        //15.2

        //16.1

        //17.private

        //18.3

        //뭔가 정확한 코드를 외워가지고 바로 쓰는거가 생각보다 어렵네요 ㅠ




    }


}
