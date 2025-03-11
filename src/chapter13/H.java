package chapter13;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
//NoArgsConstructor
@AllArgsConstructor//전부다 매개변수로 가진다/
@RequiredArgsConstructor//필수만 매개변수로 가진다
//2. 클래스의 ToString()메서드를 자동으로 구현한다.
    /*
    객체를 출력하는 경우 지정된 형식으로 출력하는데
    클래스명(필드명1 = 필드값1, 필드명2 = 필드값2 ..)

     */


class Lombok{
    private final String title;
    private String author;
}


public class H {
    public static void main(String[] args) {
//        Lombok lombok = new Lombok();
//        lombok.setTitle("cyrano");
//        lombok.setAuthor("Edmond Lostang");
//        System.out.println(lombok);

        Lombok lombok = new Lombok("cyrano");
        Lombok lombok1 = new Lombok("The man who Laughs","victor Hugo");

        System.out.println(lombok1);
        System.out.println(lombok);

    }





}
