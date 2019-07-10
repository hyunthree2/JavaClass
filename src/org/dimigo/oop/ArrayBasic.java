package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 타입 배열
        // 기본형 : int, float, double, char, boolean, byte, long, short
        int[] intArr = null;
        intArr = new int[5];
        printArray(intArr);

        int[] intArr2 = {1, 2, 3, 4, 5};
        // int[] intArr2 = new int[] {1, 2, 3, 4, 5};
        printArray(intArr2);

        // double 타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = new double[5];
        printArray(doubleArr);

        // 참조형 타입 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "흰돌이";
        strArr[1] = "김원필";
        strArr[2] = "윤도운";
        printArray(strArr);

        String[] strArr2 = {"ITZY", "이달의 소녀", "우주소녀"};
        // String[] strArr2 = new String[] {"ITZY", "이달의 소녀", "우주소녀"};
        printArray(strArr2);

        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 200);

        printArray(bookArr);

        Book[] bookArr2 = new Book[] {
                new Book("수학의 바이블", "김재영", 100),
                new Book("워드마스터", "전유원", 200)
        };
        printArray(bookArr2);

        // 배열 사용시 주의사항!!!
        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3[intArr3.length-1]);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
        // System.out.println(strArr3[0].length()); // null.length 불가능

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);
        System.out.println(bookArr3[0].getTitle());
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr) {
            System.out.println(value); // toString 구현했으면 자동으로 찾아서 호출 해줌
        }
        System.out.println();
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        for(int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }
}
