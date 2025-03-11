package chapter13;


//빌더 패턴

/*




 */
class Pizza{
    private final String menu;
    private final String size;
    private final boolean cheese;
    private final boolean mushroom;
    private final boolean pepperoni;

//    public Pizza(String menu, String size) {
//        this.menu = menu;
//        this.size = size;
//        this.cheese = false;
//        this.mushroom = false;
//        this.pepperoni = false;
//    }
//
//    //위 두개는 필수값이고, 아래 세 가지는 선택값
//
//
//    public Pizza(String menu, String size, boolean cheese, boolean mushroom, boolean pepperoni) {
//        this.menu = menu;
//        this.size = size;
//        this.cheese = cheese;
//        this.mushroom = mushroom;
//        this.pepperoni = pepperoni;
//    }


    //빌더 패턴을 사용하였을 때
    public static class Builder{
        //필수 필드값
        private final String menu;
        private final String size;
        //선택 필드값(기본값 설정 - 입력 안하면 해당 값으로 입력)
        private boolean cheese = false;
        private boolean mushroom= false;
        private boolean pepperoni= false;

        public Builder (String menu,String size){
            this.menu = menu;
            this.size = size;
        }

        public Builder addCheese(){
            this.cheese = true;
            return this;
        }

        public Builder addMushroom(){
            this.mushroom = true;
            return this;
        }

        public Builder addPepperoni(){
            this.pepperoni = true;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);

        }
    }

    private Pizza (Builder builder){
        this.menu = builder.menu;
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.mushroom = builder.mushroom;
        this.pepperoni = builder.pepperoni;
    }



}
public class E_Builder {
    public static void main(String[] args) {


        //Pizza noBuilderPizza = new Pizza("파인애픒피자","ㅣ",false,false,false);
        Pizza builderPizza = new Pizza.Builder("고구마피자","M").build();
        Pizza option1Pizza = new Pizza.Builder("PhotatoPizza","M").addCheese().build();

        //메서드 체이닝
         //: 메서드 호출 뒤 반환되는 데이터에 곧바로 추가 메서드 호출


    }
}

