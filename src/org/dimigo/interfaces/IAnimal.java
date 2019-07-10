package org.dimigo.interfaces;

// 인터페이스 : 하나의 표준/규약 명세
public interface IAnimal {
    // 필드
    // public String farmName = null; // 초기화 안 하면 null로 초기화 안 됨. 왜냐하면 인터페이스는 무조건 상수 처리(public static final)
    String FARM_NAME = "디미 농물농장";

    // 추상 메소드 선언
    // 인터페이스의 메소는 모두 추상이므로 public abstract 생략 가능 -> 자동으로 앞에 붙음
    void bark();

    default void eat() { // default 자동 추가는 JDK 8부터 가능
        System.out.println("냠냠");
    }

    public static void welcome() {
        System.out.println(FARM_NAME + "에 오신 걸 환영합니다.");
    }
}