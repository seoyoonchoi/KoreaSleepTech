package chapter16;


import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.BiFunction;

class StaticMethod {
    static void PrintUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}
//
//Class Calculator{
//    void add(){
//
//    }
//        }

public class C_MethodREF {
    public static void main(String[] args) {


        List<String> fruitsfo = Arrays.asList("apple", "peach", "banana");
        fruitsfo.forEach(StaticMethod::PrintUpperCase);
//        Calculator calculator = new Calculator();
//
//        BiFunction<Integer,Integer,Integer> addition = calculator::add;
//        int result = addition.apply(5,3);
//        int result2 = addition.apply(15,13);
//        System.out.println(result);
//        System.out.println(result2);


    }
}
