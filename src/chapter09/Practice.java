package chapter09;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일을 YYYY-MM-DD 형태로 입력하세요");
        String inputDate = sc.nextLine();

        //2. 사용자의 입력을 LocalDate 타입으로 변환(formatter)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //cf).ofPattern()에서 쓰이는 형식 키워드는 월(M) 시(H) 분(m)외에는 모두 소문자

        //LocalDate.parse(a,b);
        //a를 b로 재구성하다.
        //cf) parse 분석하다.

        LocalDate birthDate = LocalDate.parse(inputDate,formatter);

        //3. 현재 날짜 구하기
        LocalDate today = LocalDate.now();

        //4. 올해의 생일 계산
        //.withYear()연도를 조작하는 메서드
        LocalDate nextBirthday = birthDate.withYear(today.getYear());

        //5. 생일이 이미 지났다면 연도값을 내년으로 설정한다
        if(nextBirthday.isBefore(today)|| nextBirthday.isEqual(today)){
            nextBirthday = nextBirthday.plusYears(1);
        }

        //6. 남은 일수 계산
        //ChoronoUnit.Days : java.time Package에서 날짜와 시간간의 차이를 계산할 때 사용
        //.between(a,b): aㅇ와 B 사이의 날짜나 시간의 ㅏ이를 반환한다

        long daysUtilNextBirthday = ChronoUnit.DAYS.between(today,nextBirthday);

        //7. 결과출력
        System.out.println("남은 생일까지"+daysUtilNextBirthday+"남았숨니다");

    }
}
