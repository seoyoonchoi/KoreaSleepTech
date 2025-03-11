package chapter14;

//메서드 참조

import java.util.function.Function;
import java.util.function.Supplier;

//-className::staticMethod
class StaticMethodRef{
    static int doubleValue(int x){
        return x*2;
    }
}

//instance :: instancemethod

class Person{
    private String name;

    public Person(){
        this.name = "이름 미상";
    }
    public Person(String name){
        this.name = name;
    }
    public String getName(){return name;}
}

//ClassName ::instanceMethod






public class F_Lambda {
    public static void main(String[] args) {
        Supplier<String> sayHello = ()-> "안녕";
        System.out.println(sayHello.get());
        Function<Integer,Integer> doubleLambda = x -> StaticMethodRef.doubleValue(x);
        Function<Integer,Integer> doubleLambdaRef = StaticMethodRef::doubleValue;
        System.out.println(doubleLambdaRef.apply(10));//20
        System.out.println(doubleLambda.apply(15));//30


        //2. =========================================
        String hello = "hello";

        Supplier<String> toUpperlambdaRef = hello::toUpperCase;
        System.out.println(toUpperlambdaRef.get());
        //=========================================
        Supplier<Person> personLambda = () -> new Person("bergerac");
        Person p1 = personLambda.get();
        System.out.println(p1.getName());

        Supplier<Person> personLambdaRef = Person::new;
        Person p2 = personLambdaRef.get();
        System.out.println(p2.getName());




    }
}























