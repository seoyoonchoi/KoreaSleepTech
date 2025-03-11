package chapter10;

import java.util.HashSet;
import java.util.Set;

public class D_Set {
    public static void main(String[] args) {
        //add(), remove(), contains(), size(), isEmpty()
        //set<타입> set명 = new Set컬렉션 종류<>();
        Set<String> programming = new HashSet<>();

        //요소 추가
        programming.add("java");
        programming.add("Python");
        programming.add("C");
        programming.add("javascript");
        System.out.println(programming);
        System.out.println("-------------------");


        programming.add("java");
        System.out.println(programming);

        boolean result = programming.remove("Python");
        System.out.println(programming);
        System.out.println(result);

        System.out.println("----------------");

        boolean falseResult = programming.remove("R");
        System.out.println(falseResult);//false

        System.out.println(programming.size());

        System.out.println(programming.contains("Python"));//false(이미 제거됨)
        System.out.println(programming.contains("java"));//true


        //clear and empty에 대해 알아보자
        System.out.println(programming.isEmpty());//false
        programming.clear();
        System.out.println(programming.isEmpty());//true






    }
}
