package chapter16;

import otherPackage.PublicClass;

enum Operation{
    ADD{
        public int apply( int x, int y ){
            return x+y;
        }
    },
    SUBSTRACT{
        public int apply( int x, int y ){
            return x-y;
        }
    },
    MULTIPLY{
        public int apply( int x, int y ){
            return x*y;
        }
    };
    public abstract int apply(int x, int y);
}

enum Season{
    SPRING("봄"), SUMMER("여름"),AUTUMN("가을"),WINTER("겨울");

    private final String seasonName;


    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }
}





public class C_EnumOverriding {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(5,3));
        System.out.println(Operation.SUBSTRACT.apply(5,3));
        System.out.println(Operation.MULTIPLY.apply(5,3));

        Season season = Season.WINTER;
        switch (season){
            case SPRING:
                System.out.println("vom vom vom");
                break;
            case SUMMER:
                System.out.println("한여름밤의 꿀");
                break;
            case AUTUMN:
                System.out.println("나 가을 타나봐");
                break;
            case WINTER:
                System.out.println("징글벨 징글벨");
                break;

                /*
                징글벨 징글벨
                 */
        }


    }
}
