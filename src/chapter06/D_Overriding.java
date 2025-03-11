package chapter06;

class ParentClass{
    void exercise(){
        System.out.println("good runner");
    }
}

class Childclass extends ParentClass{
    @Override

    void exercise(){
        super.exercise();
        System.out.println("피구도 잘합니다.");
    }

}


class AnimalClass{
    void sound(){
        System.out.print("동물이 울음소리를 냅니다 : ");
    }
}

class DogClass extends AnimalClass{
    //코드 어노테이션
    //코드에 메타데이터를 제공하는 방법
    @Override
    void sound(){
        super.sound();
        System.out.println("멍멍");
    }
}

class CatClass extends AnimalClass{
    @Override
    void sound(){
        System.out.println("야옹");
    }
}

public class D_Overriding {
    public static void main(String[] args) {
        Childclass childclass = new Childclass();
        childclass.exercise();

        AnimalClass animalClass = new AnimalClass();
        animalClass.sound();
        DogClass dog1 = new DogClass();
        dog1.sound();
        CatClass cat1 = new CatClass();
        cat1.sound();

    }
}
