package chapter06;

import java.util.ArrayList;

class Student{
    int studentID;
    String name;
    int age;
    String major;
    double gpa;

    Student(){//초기화 설정
        this.studentID = 0;
        this.name = "Unknown";
        this.age = 20;
        this.major = "undefined";
        this.gpa = 0.0;
    }


    Student(int studentID, String name, int age, String major, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
    }

    public Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    void printStudentInfo(){
        System.out.println("ID : "+studentID);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Major : "+major);
        System.out.println("Gpa : "+gpa);
    }

    void updateGpa(double newGpa){
        this.gpa = newGpa;
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> studentList = new ArrayList<>();

    //학생 등록
    static void addStudent(int studentID, String name, int age, String major, double gpa){
        Student student = new Student(studentID,name,age,major,gpa);
        studentList.add(student);
        //numberList.add();
        System.out.println("student "+studentID+" 학생이 등록되었슴다!");
    }

    //학생 출력
    static void printAllStudents(){
        System.out.println("전체 학생 목록");
        for (Student student : studentList){
            student.printStudentInfo();
        }
    }
    //static method는 인스턴스화 없이 클래스 자체에서 호출이 가능하다
    //main 메서드 내부에서 다른 메서드 호출 시 반드시 해당 메서드는 static이어야 한다.

    static void findStudentById(int studentID){
        for(Student student : studentList){
            if(student.studentID ==studentID){
                student.printStudentInfo();
                return;
            }
        }
        System.out.println("해당 아아디의 학생을 찾을 수 없습니다.");
    }

    //평점 업데이트
    static void updateGPA(int studentID, double newGPA){
        for(Student student : studentList){
            if(student.studentID ==studentID){
                student.updateGpa(newGPA);
                System.out.println("학생 "+studentID+"의 GPA가 "+newGPA+"로 수정되었습니다.");
                return;
            }
        }
        System.out.println("해당 아아디의 학생을 찾을 수 없습니다.");
    }


    public static void main(String[] args) {
//        Student student1 = new Student(1,"leesunga",30,"sleepdech",4.0);
//        Student student2 = new Student(2,"이도경",31,"sleepdech",3.1);
//
//        studentList.add(student1);

        //학생추가
        addStudent(1,"이승아",30,"sleepdech",4.3);
        printAllStudents();
        findStudentById(1);
        updateGPA(1,2.0);




    }
}
