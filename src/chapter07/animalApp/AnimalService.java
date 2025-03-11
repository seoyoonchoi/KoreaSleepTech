package chapter07.animalApp;
//서비스계층
//-공통 부모타입 Animal을 활용하여 동물 객체를 처리한다.
public class AnimalService {
    void handleAnimal(Animal animal){
        animal.speak();
        //다형성을 활용하여 공통 메서드 처리

    }
}
