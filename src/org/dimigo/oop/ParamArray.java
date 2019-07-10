package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        ParamArray obj = new ParamArray();
        int[] intArr = {1, 2, 3, 4, 5};
        obj.plus(intArr);
        for(int value : intArr) {
            System.out.println(value);
        }
//        add(intArr, 20);
//        printArray(intArr);
//
//        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
//        changeName(names);
//        printArray(names);
    }

    private void plus(int[] intArr) {
        for(int i=0; i<intArr.length; i++) {
            intArr[i]++;
        }
    }


//    private static void printArray(String[] names) {
//        for (String value : names) {
//            System.out.println(value);
//        }
//    }
//
//    private static void changeName(String[] names) {
//        for (int i = 0; i < names.length; i++) {
//            names[i] = "김"+names[i].substring(1);
//        }
//    }
//
//
//    public static void add(int[] intArr, int num) {
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] += num;
//        }
//    }
//
//    public static void printArray(int[] intArr) {
////        for (int i = 0; i < intArr.length; i++)
////            System.out.println(intArr[i]);
//        for(int a : intArr) {
//            System.out.println(a);
//        }
//    }
}