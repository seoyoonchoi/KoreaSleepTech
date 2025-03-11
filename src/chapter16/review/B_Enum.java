package chapter16.review;

//enum Enum명 {}

import java.security.PrivateKey;
import java.sql.SQLOutput;

enum Fruits{
    Apple, Banana, Orange
}
enum CoffeeSize{
    SMALL(200), MEDIUM(300), LARGE(450), VENTI(760);
    private final int ml;

    CoffeeSize(int ml) {
        this.ml = ml;
    }

    public int getMl(){
        return ml;
    }
}

public class B_Enum {
    public static void main(String[] args) {
        Fruits apple = Fruits.Apple;
        System.out.println(apple);

        System.out.println(Fruits.values());//[Lchapter16.review.Fruits;@119d7047
        for(Fruits fruit : Fruits.values()){
            System.out.println(fruit);
        }

        //2)
        String appleName = Fruits.Apple.name();
        System.out.println(appleName.toLowerCase());

        //3)
        Fruits orange = Fruits.valueOf("Orange");

        //4
        System.out.println(orange.ordinal());

        CoffeeSize size = CoffeeSize.MEDIUM;
        System.out.println(size+"의 용량은"+size.getMl()+"입니다.");

        CoffeeSize anotherSize = CoffeeSize.LARGE;
        System.out.println(anotherSize+"의 용량은"+anotherSize.getMl()+"입니다.");
/*
MEDIUM의 용량은300입니다.
LARGE의 용량은450입니다.
 */



    }
}
