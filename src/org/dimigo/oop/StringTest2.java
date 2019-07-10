package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        // String으로 문자열 생성
        String str = "디미고 ";
        str += "2학년 ";
        str += "4반 ";
        str += "이현선";
        System.out.println(str);

        // StringBuffer, StringBuilder
        StringBuilder sb = new StringBuilder("디미고 ");
        sb.append("2학년 ").append("4반 ").append("이현선"); // 메소드 체이닝
        System.out.println(sb.toString());

        comapreSpeed();
    }

    private static void comapreSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer(str);
        StringBuilder sb2 = new StringBuilder(str);

        for(int i=0; i<10000000; i++) {
            // str += "def";
            sb2.append("def");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start); // 수행 시간 측정
    }
}