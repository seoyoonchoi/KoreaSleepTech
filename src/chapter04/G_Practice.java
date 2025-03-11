package chapter04;

class Card{
    int number;
    String kind;
    //클래스 변수
    static int width = 100;
    static int height = 200;
}

public class G_Practice {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "spade";
        c1.number = 7;

        System.out.println(c1.kind+c1.number);
    }
}
