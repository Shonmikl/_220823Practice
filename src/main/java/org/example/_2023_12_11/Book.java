package org.example._2023_12_11;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Book {
    private String author;
    private String title;
    private int issueYear;
    private Condition condition;
    private boolean isEBOOK;

    public Book(String author, String title, int issueYear, Condition condition, boolean isEBOOK) {
        this.author = author;
        this.title = title;
        this.issueYear = issueYear;
        this.condition = condition;
        this.isEBOOK = isEBOOK;
    }
}