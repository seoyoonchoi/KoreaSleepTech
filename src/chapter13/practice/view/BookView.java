package chapter13.practice.view;

import java.util.Scanner;

public class BookView {
    private final Scanner sc = new Scanner(System.in);

    public void showMenu(){
        System.out.println("도서관리시스템");
        System.out.println("1. 도서 추가");
        System.out.println("2. 전체 조회");
    }
}
