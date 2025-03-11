package chapter07;

class Student{
    private String name;
    private int residentNumber;
    private int age;
    private int score;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getResidentNumber() {
        return residentNumber;
    }

    public void setResidentNumber(int residentNumber) {
        this.residentNumber = residentNumber;
    }

    public String getAge() {
        //단순한 데이터 반환이 아닌 데이터 가공역할을 담당하기도 한다.
        if(age<19){
            return "미성년자";
        }else{
            return "성인";
        }
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("invalid age");
        }else{
        this.age = age;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class B_Encapsulation {
    public static void main(String[] args) {
        /*
        데이터 보호나 유지보수성 향상을 목적으로 데이터 필드나 속성을 Private로 선언함
        >>데이터에 접근하거나 수정할 때는 getter&setter 메서드를 사용하는 체계

        1) getter : 객체의 특정 필드 값을 읽는 메서드
        get<필드명>();
        Ex)getName, getAge....
        2)setter : 객채의 특정 필드 값을 설정하는 메서드
        set<필드명>();
        ex)setName, setAge

         */

        Student student = new Student();
        student.setName("이승아");
        student.setAge(29);
        student.setResidentNumber(123456);
        //데이터의 불변성을 지키기 위해서 final keyword

        student.setScore(56);
    }
}
