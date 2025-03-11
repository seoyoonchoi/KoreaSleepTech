package chapter07;

/*
1)Book class
title, author, isAvailable
 */

class Book {
    private final String title;
    private final String author;
    private boolean isAvailable = true;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title+"가 대여완료되었습니다");
        } else {
            System.out.println(title+"의 대여가 불가합니다.");
        }
    }

    void returnBook() {
        if (isAvailable) {
            System.out.println(title+"을 대여한 적이 없습니다.");
        } else {
            isAvailable = true;
            System.out.println(title+"의 반납이 완료되었습니다.");
        }
    }

    void displayInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("대여 : " + (isAvailable ? "가능" : "불가"));
        System.out.println("-------------------------------------------------------");
    }


    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
}

class Ebook extends Book{
    private double filesize;


    public Ebook(String title, String author,double filesize) {
        super(title, author);
        this.filesize = filesize;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("file size : "+filesize+"MB");
    }

    double getFilesize(){
        return filesize;
    }





}


public class D_OOP_Prac {
    public static void main(String[] args) {
        //Book 객체 생성
        Book book1 = new Book("역사의 쓸모","최태성");
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();

        Ebook ebook1 = new Ebook("sweet spot","sam richard",131.23);
        ebook1.borrowBook();

    }
}
