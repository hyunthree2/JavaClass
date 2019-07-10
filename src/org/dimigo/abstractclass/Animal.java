package org.dimigo.abstractclass;

public abstract class Animal {
    public void eat() {
        System.out.println("냠냠");
    }
    // 추상클래스 : 자식클래스에서 반드시 오버라이딩 하셈
    public abstract void bark();
}