package org.dimigo.basic;

public class PrimitiveDataType {
    static boolean flag;
    public static void main(String[] args) {
        System.out.println(flag ? "참입니다" : "거짓입니다");

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.printf("%c %c %c\n",c1, c2, c3);
        System.out.println('뷁');

        String name = "김원필";
        System.out.println("My name is " + name);

        int i1 = 10;
        int i2 = 0b00001010;
        int i3 = 012;
        int i4 = 0x0A;
        System.out.printf("%d %d %d %d\n", i1, i2, i3, i4);

        // byte(-128 ~ 127)
        byte b1 = -128;
        byte b2 = 127;

        b1--;
        b2++;  // 최솟값에서 빼거나, 최댓값에서 더하면 순환함

        System.out.println(b1);
        System.out.println(b2);

        //정수의 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE); // 대문자로 시작했으니 클래스
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

        long l1 = 10000000000L;

        float f1 = 3.14f;
        double d1 = 3.14; // 3.14d

        System.out.println(f1);
        System.out.println(d1);

        float f2= 0.12345678901234567890f;
        double d2 = 0.12345678901234567890;

        System.out.println(f2);
        System.out.println(d2);

        System.out.printf("%c, %d, %.2f, %s\n",'A', 100, 12.345, "하하");
    }
}