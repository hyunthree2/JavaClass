package org.dimigo.oop;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String[] src = {"서울", "대전", "대구", "부산"};
        int[] intar = {1, 2, 111, 33};

        // 배열 출력
        System.out.println(Arrays.toString(src));

        // 배열 복사 (src -> dest)
        String[] dest = Arrays.copyOf(src, src.length);
        System.out.println(Arrays.toString(dest));

        // 배열 비교
        System.out.println(src == dest);
        System.out.println(Arrays.equals(src, dest));

        // 배열 정렬
        Arrays.sort(intar);
        System.out.println(Arrays.toString(intar));
        System.out.println(Arrays.toString(dest));

        // 배열 검색
        System.out.println(Arrays.binarySearch(dest, "대전"));
    }
}