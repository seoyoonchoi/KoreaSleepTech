package chapter04;

class Person{
    public static int population=0;
    String name;
    int age;

    public Person() {
        population++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        population++;

    }//이걸 초기화라고 한다고 한다

    void introduce(){
        System.out.println("안녕하세요, 저는 "+name+"이고, "+age+ "살입니다.");
    }


}

public class H_Problem {
    public static void main(String[] args) {
        Person person = new Person("홍길동",24);

        person.introduce();
        System.out.println(Person.population);

        new Person();
        new Person();
        new Person();
        new Person();
        new Person();

        System.out.println(Person.population);
    }
}
