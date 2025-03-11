package chapter07.animalApp;

import java.util.ArrayList;

//동물 관리 시스템
public class MainApp {
    public static void main(String[] args) {
        //실행계층생성
        //서비스 객체의 handle Animal Method 는 Animaltype의 객체를 인자로 받음
        AnimalService service = new AnimalService();
        //동물을 관리하는 List생성
        ArrayList<Animal> animals = new ArrayList<>();

        //동적 배열의 객체 추가
        //Animal 타입에 Cat/ Dog 객체가 추가된다
        //>> Upcasting(자동 타입 변환)
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        //리스트의 모든 동물을 service에 전달하여 출력
        for(Animal animal : animals){
            if(animal instanceof Cat){
                System.out.println("고양이가 존재한다");
            }
            service.handleAnimal(animal);
        }

        //객체 생성 및 처리
        Animal cat = new Cat();
        Animal dog = new Dog();

        service.handleAnimal(cat);
        service.handleAnimal(dog);

        if(cat instanceof Cat){
            Cat onlycat = (Cat) cat;
            //다운캐스팅 - 해당클래스가 가진 고유 멤버 필드나 메서드에 접근가능
            onlycat.eat();



        }

    }

}
