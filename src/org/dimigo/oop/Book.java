package org.dimigo.oop;

public class Book {
    //필드 선언
    private String title;
    private String author;
    private int page;
    // 접근 제어자가 public이면 다른 클래스에서 접근/수정 가능

    // 기본 생성자 -> 넣지 않아도 컴파일러가 알아서 기본 생성자 호출해줌(추가 생성자가 없을 경우에만 자동으로 넣어줌)
    public Book() {
        System.out.println("기본 생성자 호출");
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title) {
        this(title, "저자미상");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                ", author=" + author +
                ", page=" + page +
                '}';
    }
}