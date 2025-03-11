package chapter08;

/*abstract class 추상클래스명{
    abstract void 추상메서드명();
 }
*/
abstract class Human{
    abstract void work();
}

class Police extends Human{
    @Override
    void work() {
        System.out.println("경찰은 치안유지 업무를 담당합니다");
    }
}

class Student extends Human{

    @Override
    void work() {
        System.out.println("학생은 공부를 합니다.");
    }
}

//cf)다중 상속 금지
//ex. 라이거
abstract class Animal{
    abstract void makeSound();
    void eat(){
        System.out.println("동물은 먹이를 먹습니다.");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("멍멍");
    }

    void eat(){
        System.out.println("강아지는 개껌을 먹습니다.");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("야옹");
    }
}

public class A_Abstract {
    public static void main(String[] args) {
//        Animal animal = new Animal() {
//            @Override
//            void makeSound() {
//
//            }
//        } // 추상 클래스로는 인스턴스화 할 수 없습니다.
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();


        cat.eat();













    }
}
