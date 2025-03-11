package chapter03;

import java.util.Arrays;

public class D_array {
    public static void main(String[] args) {
        //array 클래스 : 배열을 조작하는데 유용한 기능들을 제공해주는 자바 내부 클래스
        //정렬, 검색, 변환 등
        //arrays class 사용법

        int[] numbers = {3,5,1,4,2};
        //1. 배열정렬 ( 오름차순)
        //Arrays.sort(정렬할 배열);
        //cf.(마침표)연산자 : 해당 클래스 내부의 기능을 사용한다.
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        //배열의 변환작업
        //Arrays.toString(변환한 배열을 작성한다.);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        //배열 내 검색
        //Arrays.binarySearch(배열, 검색내용);
//         - 존재o : 존재하는 요소의 인덱스 번호를 반환한다
        // - 존재x : 음수반환(검색내용)
        System.out.println(Arrays.binarySearch(numbers,3));
        System.out.println(Arrays.binarySearch(numbers,6));

        //cf) binarySearch()는 반드시 정렬된 배열 내에서 검색해야함
        // 해당 기능이 이진탐색알고리즘을 사용하기 때문
        //4. 배열의 비교
        //Arrays. equals(a배열, b 배열);
        //논리 형태로 반환한다(true, false)
        int[] numbers2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(numbers2,numbers2));
        //arrays.equals 함수는 순서일치의 여부 또한 동일한 array의 조건으로 본다

        //5. 배열의 채움
        // : Arrays. fill(배열, 삽입할 값);
        // - 배열의 모든 요소를 특정 값으로 채움(같은값)
        int[] examples = new int[3];
        System.out.println(Arrays.toString(examples));

        Arrays.fill(examples,10);
        System.out.println(Arrays.toString(examples));



    }
}
