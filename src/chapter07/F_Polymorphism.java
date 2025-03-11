package chapter07;

class Vehicle{
    void displayInfo(){
        System.out.println("운송수단입니다.");
    }
}

class Bus extends Vehicle{
    @Override
    void displayInfo(){
        System.out.println("버스를 타고 갑니다");
    }
}

class Subway extends Vehicle{
    @Override
    void displayInfo(){
        System.out.println("지하철을 타고 갑니다.");
    }
}

class Bird{
    void displayInfo(){
        System.out.println("새는 운송수단이 아닙니다.");
    }
}



public class F_Polymorphism {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle bus = new Bus();
        Vehicle subway = new Subway();
        //Vehicle bird = new Bird();
        //Bird 는 Vehicle을 상속받지 않았기 때문에 오류가 나게 된다.

        if(subway instanceof Vehicle){
            subway.displayInfo();
        }

        if(bus instanceof Vehicle){
            bus.displayInfo();
        }

        if(vehicle instanceof Bus){
            System.out.println("운송수단은 버스입니다.");
        }else{
            System.out.println("운송수단은 버스가 아닙니다.");
        }
    }
}
