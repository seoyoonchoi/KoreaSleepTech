package chapter10;

import java.util.*;

//name : cyrano, name: bergerac
//name : bergerac nickname : bergerac
public class E_Map {
    public static void main(String[] args) {
        //Map<키타입, 값타입> 인스턴스명 = new Map종류<>();

        Map<String, Integer> students = new HashMap<>();//이름(키), 나이(값)

        students.put("cyrano",25);
        students.put("bergerac",34);
        //결과값 : {cyrano=25, bergerac=34}
        //{키 = 값, 키 = 값} - 키와 값의 구분을 =으로 표시

        System.out.println(students);
        //get-----------------
        System.out.println(students.get("cyrano"));//결과 : 25

        students.remove("cyrano");
        System.out.println(students);//{bergerac=34}

        System.out.println(students.containsKey("cyrano"));//결과 : false
        System.out.println(students.containsKey("bergerac"));//결과 : true

        System.out.println(students.size());

        System.out.println(students.keySet());

        Collection<Integer> ages = students.values();
        System.out.println(ages);

        List<Integer> listAges = new ArrayList<>(ages);
        System.out.println(listAges);

        System.out.println(students.entrySet());




    }
}
