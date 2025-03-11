package chapter04.objects;

public class Coffee {
    String categories;//커피의 종류(속성)
    int price;//커피의 가격(속성)
    int inventory;//커피의 재고(속성)
    int temp;//커피의 온도(속성)
    public static int primeCost_Americano=2500;
    public static int primeCost;
    //커피의 원가(변하지 않으므로 static 변수로 설정해준다.


    public Coffee() {
    }

    public Coffee(String categories, int price, int inventory, int temp) {
        this.categories = categories;
        this.price = price;
        this.inventory = inventory;
        this.temp = temp;
    }


    String makeCoffee(){
        if(temp>=70) {
            return "커피가 완성되었습니다.";
            //커피의 온도가 70도가 넘었다면 커피를 만들어주는 메서드
        }else{
            return "커피가 데워지는 중입니다.";
            //커피의 온도가 이보다 낮다면 커피가 완성되지 않음
        }
    }

    int manageInventory(int uses){
        //재고관리를 해주는 메서드 사용한 만큼을 넣어주면 원래의 재고에서 사용한 만큼을 빼준다.
        inventory = inventory-uses;
        return inventory;
    }

    int priceSetting(int profit){
        //판매가를 설정해주는 메서드.
        //원하는 이익금을 입력하면 원가와 더해서 판매가를 return 해준다.
        price = profit+primeCost;
        return price;
    }

    void displayInfo(){
        System.out.println("주문하신 음료는 : "+categories);
        System.out.println("주문하신 음료의 가격은 : "+price);
        System.out.println("현재 주문 가능한 수량은 : "+inventory);
        System.out.println(makeCoffee());
        System.out.println();
    }



}
