package chapter03;

/*
자바배열(정적)
한번 생성되면 크기변경이 안되는데, 크기 변경이 필요한 경우 변경된 크기의 배열을 생성하여 요소값을 복사한다.

동적배열(ArrayList)사용법
1. ArrayList
Java의 동적배열구현체, 크기제한 없이 동적으로 요소를 추가하거나 삭제하는 것 가능하다.
java Collection Framework의 일부 : java. util.ArrayList에서 제공

2. ArrayList의 장점
: 동적크기, 유연성, 다양한 메서드(기능)제공

3. ArrayList의 주의점
cf)int[] 배열명 = new int[크기];
: 정적배열의 경우 기본값이 '기본데이터'로 지정된다
boolean[] - false
char[] - ''
int[] - 0
double[] - 0.0
==>ArrayList의 경우 기본 데이터 타입 사용이 불가능하다.
: 참조 데이터 타입만 사용가능하다.
String(문자열)
int>>integer
char>>Character
이외의 기본 데이터타입은 첫 글자를 대문자로 작성한다.

+)참조 데이터 타입은 기본값이 모두 null이다
cf)null : 아무 객체도 참조하지 않음을 나타내는 값이다(기본 데이터 타입에서는 사용불가)

+)Collection Framework의 모든 클래스 내부에서는 객체 구조만을 다룬다.
 : 기본타입 사용이 불가능하다

 <Array list 생성방법>
 ArrayList<데이터타입> 변수면 = new ArrayList<>(초기용량);
int[] numberArray = new int[];
정적 배열은 크기값 미지정시 오류가 난다
크기를 명시적으로 전달하지 않을 경우 실제 요소값이라도 전달해야한다

 */

import java.util.ArrayList;
import java.util.Arrays;

public class E_array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        Integer a = null;
        ArrayList<Integer> arrayList = new ArrayList<>();
        //초기용량 미지정시 기본값이 10으로 설정된다.
        //해당 용량은 배열 사용 시 담겨있는 요소의 크기만큼만 측정된다.

        System.out.println(arrayList);//[]

        /*
        ArrayList 데이터 추가
        배열의 마지막에 값을 추가한다
        배열명.add(추가할 데이터
         */
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList);//[10,20,30]

        /*
        ArrayList 데이터 변경
        - 배열명.set(index번호, 변경할 데이터);
         */

        arrayList.set(1,50);
        System.out.println(arrayList);

        //3, ArrayList 데이터 삭제하는 방법
        //-.배열명.remove(인덱스번호);
        arrayList.remove(2);
        System.out.println(arrayList);

        //4. ArrayList 크기확인
        //배열명.size();
        System.out.println(arrayList.size());

        //+)ArrayList원하는 위치에 데이터 삽입하는 법
        //-배열명.add(인덱스번호, 데이터값);

        arrayList.add(1,123);
        System.out.println(arrayList);

        //+)특정요소접근
        //-배열명.get(인덱스번호)
        System.out.println(arrayList.get(1));//123


    }
}
