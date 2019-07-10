package org.dimigo.oop;

public class StringTest {
    public static void main(String[] args) {
        // 문자열 리터럴 방식 (Literal pool)
        String dog1 = "멍멍이";
        String dog2 = "멍멍이";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        // new 객체 생성 방식
        String cat1 = new String("야옹이");
        String cat2 = new String("야옹이");
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        // 문제
        System.out.println(dog1 == "멍멍이");
        System.out.println(cat1 == "야옹이");

        String id = null;

        // id가 "admin"이면 "관리자" 출력
        // "admin"이 아니면 "관리자 아님" 출력

        if("admin".equals(id)) {
            System.out.println("관리자");
        } else {
            System.out.println("관리자 아님");
        }
        testString();
    }

    private static void testString() {
        //          01234567890123
        String s = "abcdefgABCDEFG";
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        System.out.println(s.indexOf("C"));
        System.out.println(s.charAt(7));
        System.out.println(s.concat("ABC"));
        System.out.println("      ABC         ".trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace("a", "A"));
        System.out.println(s.startsWith("abcD"));
        System.out.println(s.endsWith("G"));
    }
}
