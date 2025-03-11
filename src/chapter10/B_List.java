package chapter10;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_List {
    public static void main(String[] args) {
        System.out.println("ArrayList--------------");
        ArrayList<String> arrayList = new ArrayList<>();
        //List 인터페이스를 상속받는 AbstractList 추상클래스가 있고 이를 ArrayList Class가 상속받는다.

        //데이터 추가하기
        arrayList.add("Java");//리스트 끝에 요소 추가
        arrayList.add(0,"Python");//원하는 인덱스에 요소 추가
        arrayList.add(0,"Java1");
        arrayList.add("JavaScript");

        System.out.println(arrayList);
        //결과는 JAVA가 두번째, 원하는 요소에 넣어서 밀린다.

        System.out.println("---------------------------");

        //뎅터 읽기
        String firstElement = arrayList.get(0);//해당 인덱스의 요소를 반환
        System.out.println(firstElement);//Python

        System.out.println("데이터 수정");
        arrayList.set(2,"TypeScrit");// 해당 인덱스의 요소를 변경
        System.out.println(arrayList);

        System.out.println("데이터 삭제");
        //해당 인덱스의 요소를 삭제 후 반환한다.
        String removedElement = arrayList.remove(1);
        System.out.println(removedElement);
        System.out.println(arrayList);

        System.out.println("리스트 크기");
        System.out.println(arrayList.size());

        System.out.println("============Linked List============");
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("데이터 추가 " );
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add(1,"Banana");
        System.out.println(linkedList);

        System.out.println("데이터 읽기");
        String secondFruit = linkedList.get(1);
        System.out.println(secondFruit);

        System.out.println("데이터 포함 여부 확인");
        //리스트. contains(요소값);
        //포함 여부를 boolean 값으로 반환
        System.out.println(linkedList.contains("Orange"));//True
        System.out.println(linkedList.contains("Strawberry"));//false

        System.out.println("ArrayList와 LinkedList의 성능 비교");
        ArrayList<Integer> arrayListTest = new ArrayList<>();
        /*
        **클래스 구조의 객체 타입 데이터
        : 클래스 구조는 객체 타입의 데이터만 삽입 가능
          ex) Integer, character, Boolean, Double
         */

        long startTime = System.nanoTime();//1초 : 1000000000나노초
        System.out.println(startTime);//394791035567900

        for(int i = 0; i<100000;i++){
            arrayListTest.add(0,i);
        }long endTime = System.nanoTime();
        System.out.println("ArrayList 삽입시간: "+(endTime-startTime)+"ns");

        //--------------------------------------
        LinkedList<Integer> linkedListTest = new LinkedList<>();

        long startTimel = System.nanoTime();//1초 : 1000000000나노초
        System.out.println(startTime);//394791035567900

        for(int i = 0; i<100000;i++){
            linkedListTest.add(0,i);
        }long endTimel = System.nanoTime();
        System.out.println("LinkedList 삽입시간: "+(endTimel-startTimel)+"ns");




    }
}
