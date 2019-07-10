package org.dimigo.oop;

import java.lang.System;
//System, String등 많이 사용하는 클래스를 모아둔 java.lang 패키지는 import문 없어도 자동으로 java.lang.* 추가 됨

public class Car {

    private String company;
    private int price;
    private float fuelEfficiency;
    private String color;
    private String type;

    public void forward() {
        System.out.println("전진합니다!!");
    }

    public void backward() {
        System.out.println("후진합니다!!");
    }

    public boolean stop() {
        System.out.println("멈춥니다!!");
        return true;
    }

    public void turnRight(int angle) {
        System.out.println(angle+"도 우회전합니다!!");
    }

    public void turnLeft(int angle) {
        System.out.println(angle+"도 좌회전합니다!!");
    }

}