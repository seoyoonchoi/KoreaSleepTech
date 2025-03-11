package chapter04;

//클래스 Book
class Book{
    //class내부의 데이터(속성,필드)

    String title;
    String publisher;
    int pageNumber;

    public Book() {
    }

    public Book(String title, String publisher, int pageNumber) {
        this.title = title;
        this.publisher = publisher;
        this.pageNumber = pageNumber;
    }

    //class 내부의 동작(행동, 메서드)를 정의해보자
    void displayInfo(){
        System.out.println(title+" "+publisher+" ");
        return;//return을 만나면 메서드가 종료된다.(break와 비슷한 기능이 된다. 그래서 return 뒤에는 함수를 작성할 수 없다. return 뒤에 무언갈 입력하면 해당 코드에 접근할 수 없다는 오류메시지가 뜬다.
    }

    //생성자 메서드
    //new 연산자 사용시 호출될 메서드이다.
    //필드값 초기화에 주로 사용된다.>> 생략 시 속성에 기본값이 할당된다.
    //(참조값의 경우는 null값이 할당된다)
    //사용자 정의 메서드 생략 시 클래스명과 동일하며 매개변수가 없는 메서드가 생략된다.

}

public class D_Object {
    public static void main(String[] args) {
        Book myBook = new Book();
        System.out.println(myBook.title);
        System.out.println(myBook.pageNumber);
        System.out.println(myBook.publisher);

        Book anotherbook = new Book("snowwhilte","korea",50);
        Book thirdbook = new Book("cinderlla","a1plaza",30);

        System.out.println(anotherbook.title);
        System.out.println(thirdbook.publisher);

        myBook.title = "frogprince";
        myBook.pageNumber = 100;
        myBook.publisher = "frogpublisher";

        myBook.displayInfo();

        anotherbook.title = "콩쥐팥쥐ㅣㅣ";
        anotherbook.displayInfo();
    }
}
