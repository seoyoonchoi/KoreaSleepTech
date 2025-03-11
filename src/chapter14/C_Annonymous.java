package chapter14;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

class Student{
    private String name;
    private int score;
}

interface Grading{
    String calculateGrade(Student student);
}

public class C_Annonymous {
    public static void main(String[] args) {
        Student student1 = new Student("jo",85);
        Student student2 = new Student("jin",75);

        Grading grading = new Grading() {
            @Override
            public String calculateGrade(Student student) {
                int score = student.getScore();

                if(score>100|| score<0){
                    System.out.println("wrong score");
                    return null;
                }else if(score>=90){
                    return "A";
                }else if(score>=80){
                    return "B";
                }else if(score>=70){
                    return "c";
                }else if(score>=60){
                    return "D";
                }else {
                    return "F";
                }
            }
        };
        System.out.println(student1.getName()+grading.calculateGrade(student1));
        System.out.println();

    }
}
