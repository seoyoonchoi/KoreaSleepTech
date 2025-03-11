package Tistory;

class AnimalClass {
    void sound() {
        System.out.print("동물이 울음소리를 냅니다 : ");
    }
}

class DogClass extends AnimalClass {
    @Override
    void sound() {
        super.sound();  // 부모 클래스의 sound() 메서드 호출
        System.out.println("멍멍");
    }
}

class CatClass extends AnimalClass {
    @Override
    void sound() {
        System.out.println("야옹");
    }
}

public class OverridingExample1 {
    public static void main(String[] args) {
        AnimalClass animal = new AnimalClass();
        animal.sound(); // 부모 클래스 메서드 실행

        System.out.println(); // 줄바꿈

        DogClass dog = new DogClass();
        dog.sound(); // 오버라이딩된 메서드 실행

        CatClass cat = new CatClass();
        cat.sound(); // 오버라이딩된 메서드 실행
    }
}

