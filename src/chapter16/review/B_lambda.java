package chapter16;

import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.List;

interface AnimalInterface{
    void speak();
}

public class B_lambda {
    public static void main(String[] args) {
        //@FunctionalInterface  :  하나의 추상 메서드만을 가지는 인터페이스

        List<String> list = Arrays.asList("Apple", "Orange","Banana");

        //a.compareTo(b): a/b 두 값을 비교하여 같을경우 0
        list.sort(String::compareTo);
        System.out.println(list);

        //일반 람다식
        list.forEach(System.out::println);
        list.forEach(null);
    }
}
