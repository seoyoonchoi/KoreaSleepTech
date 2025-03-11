package chapter14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@ToString
class StudentClass {
    private String name;
    private int age;
}

public class Zollahagisilta {
    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<>(Arrays.asList(
                new StudentClass("Bergerac", 20),
                new StudentClass("Cyrano", 38),
                new StudentClass("JoeHyungGeun", 40),
                new StudentClass("ChoiJeaRim", 39),
                new StudentClass("KoEunSung", 34),
                new StudentClass("NaHaNa", 22),
                new StudentClass("KimSooYeon", 21),
                new StudentClass("LeeJiSoo", 23),
                new StudentClass("LimJunHeok", 36),
                new StudentClass("ChaYoonHea", 22),
                new StudentClass("LeeJungMin", 28)
        ));

        // 1) filter: 이름이 'L'로 시작하는 경우만 선택
        List<StudentClass> filteredStudents = students.stream()
                .filter(student -> student.getName().startsWith("L"))
                .collect(Collectors.toList());
        System.out.println("Filtered Students: " + filteredStudents);


        //
        List<String> filterbyName = students.stream()
                .filter(studentClass -> studentClass.getName().contains("a"))
                .map(StudentClass::getName)
                .collect(Collectors.toList());
        System.out.println("Filtered by name : ");
        filterbyName.forEach(System.out::println);

        // 2) map: 모든 학생의 이름을 대문자로 변환
        List<StudentClass> mappedStudents = students.stream()
                .map(student -> new StudentClass(student.getName().toUpperCase(), student.getAge()))
                .collect(Collectors.toList());
        System.out.println("Mapped Students: " + mappedStudents);

        // 3) sorted: 이름을 알파벳 순으로 정렬
        List<StudentClass> sortedStudents = students.stream()
                .sorted(Comparator.comparing(StudentClass::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted StudentsbyAlphabet " );
        sortedStudents.forEach(System.out::println);
/*
StudentClass(name=Bergerac, age=20)
StudentClass(name=ChaYoonHea, age=22)
StudentClass(name=ChoiJeaRim, age=39)
StudentClass(name=Cyrano, age=38)
StudentClass(name=JoeHyungGeun, age=40)
StudentClass(name=KimSooYeon, age=21)
StudentClass(name=KoEunSung, age=34)
StudentClass(name=LeeJiSoo, age=23)
StudentClass(name=LeeJungMin, age=28)
StudentClass(name=LimJunHeok, age=36)
StudentClass(name=NaHaNa, age=22)

Sorted Students by Age
StudentClass(name=JoeHyungGeun, age=40)
StudentClass(name=ChoiJeaRim, age=39)
StudentClass(name=Cyrano, age=38)
StudentClass(name=LimJunHeok, age=36)
StudentClass(name=KoEunSung, age=34)
StudentClass(name=LeeJungMin, age=28)
StudentClass(name=LeeJiSoo, age=23)
StudentClass(name=NaHaNa, age=22)
StudentClass(name=ChaYoonHea, age=22)
StudentClass(name=KimSooYeon, age=21)
StudentClass(name=Bergerac, age=20)

 */
        List<StudentClass> sortedStudentsByAge = students.stream()
                .sorted(Comparator.comparingInt(StudentClass::getAge).reversed())//나이 많은 순
//				.sorted(Comparator.comparingInt(StudentClass::getAge))//나이 적은 순
                .collect(Collectors.toList());

        System.out.println("Sorted Students by Age" );
        sortedStudentsByAge.forEach(System.out::println);


        // 4) distinct: 중복 제거 (중복이 있다고 가정)
        List<StudentClass> distinctStudents = students.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Students: " + distinctStudents);

        // 5) limit: 처음 5개 요소만 선택
        List<StudentClass> limitedStudents = students.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Limited Students: " + limitedStudents);

        // 6) skip: 처음 3개 요소를 건너뛴 후 나머지 출력
        List<StudentClass> skippedStudents = students.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("Skipped Students: " + skippedStudents);
    }
}

