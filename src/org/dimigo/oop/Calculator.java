package org.dimigo.oop;

public class Calculator {
    // 인스턴스(=객체를 new해서 만들 때 생김) 필드(static이 없음)
    private int num1;
    private int num2;
    private boolean powerFlag;

    public Calculator() {
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 인스턴스 메소드
    public void powerOn() {
        if(this.powerFlag) {
            System.out.println("전원을 켭니다");
            powerFlag = true;
        }
    }

    public void powerOff() {
        if(this.powerFlag) {
            System.out.println("전원을 끕니다");
            powerFlag = false;
    }
    }

    public int add() {
        System.out.println(this);
        this.powerOn();
        return this.num1 + this.num2;
    }

    public int sub() {
        this.powerOn();
        return this.num1 - this.num2;
    }

    public int mul() {
        this.powerOn();
        return this.num1 * this.num2;
    }

    public double div() {
        this.powerOn();
        return (double)this.num1 / this.num2;
    }

}
