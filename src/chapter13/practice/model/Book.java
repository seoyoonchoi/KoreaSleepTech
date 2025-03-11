package chapter13.practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter

public abstract class Book {
    private int id;
    private String title;
    private String author;

}
