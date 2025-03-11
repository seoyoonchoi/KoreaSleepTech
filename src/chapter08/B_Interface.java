package chapter08;
//인터페이스는 추상클래스보단 엄격하다 그런데 객체동작 추상방식이다.
interface PlayingCard {

    public static final int SPADE=4;
    public static int DIAMOND =3;
    public final int HEART = 2;
    int CLOVER = 1;
    //인터페이스에는 상수만 들어갈 수 있다.

    public abstract String getCardNumber();
    String getCardKind();

    default void defaultMethod(){
        System.out.println("Default Method");
    }

    static void staticMethod(){
        System.out.println("정적 메서드 입니다.");
    }

    //interface 구현방법
    class Card implements PlayingCard {

        private String cardNumber;
        private String cardkind;

        Card(String cardNumber, String cardkind) {
            this.cardNumber = cardNumber;
            this.cardkind = cardkind;
        }//인터페이스 안의 추상메서드를 구현한 클래스 메서드는 public지정이 필수적이다

        @Override
        public String getCardNumber() {
            return cardNumber;
        }

        @Override
        public String getCardKind() {
            return cardkind;
        }

        //default method 재정의
        @Override
        public void defaultMethod(){
            System.out.println("card class에서 재정의된 default 메서드");

        }
    }

}

public class B_Interface {
    public static void main(String[] args) {
        PlayingCard.Card card = new PlayingCard.Card("7","HEART");

        System.out.println(card.getCardNumber());
        System.out.println(card.getCardKind());

        card.defaultMethod();

        PlayingCard.staticMethod();

        System.out.println(PlayingCard.CLOVER);
        System.out.println(PlayingCard.HEART);
        System.out.println(PlayingCard.DIAMOND);
    }
}

