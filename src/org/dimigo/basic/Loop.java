package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // 1. for문
        // 구구단 출력하기

        for(int i=2; i<=9; i++)
        {
            for(int j=1; j<=9; j++)
                System.out.printf("%d * %d = %d\t", i, j, i*j);
            System.out.println();
        }

        // for-each
        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int value : arr) {
            System.out.println(value);
        }

        String[] DAY6 = {"김원필", "윤도운", "강영현"};
        // for-each 써서 멤버 출력
        for(String member : DAY6) {
            System.out.println(member);
        }

        // 3. while, do~while
        Scanner scanner = new Scanner(System.in);
        int menu=0;

        do {
            System.out.println("\n<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. 블랙핑크");
            System.out.println("3. 이달의소녀");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 =>\n");

            menu = scanner.nextInt();

            // 1을 입력하면 "ITZY를 선택하셨네요"
            // 2를 입력하면 "블랙핑크를 선택하셨네요"
            // 3을 입력하면 "이달의소녀를 선택하셨네요"
            // 9를 입력하면 "Bye!" 출력 후 프로그램 종료
            // 없는 메뉴 입력시 "없는 메뉴네요"

            switch(menu) {
                case 1:
                    System.out.println("ITZY를 선택하셨네요! 유나 짱 ^ㅅ^");
                    break;

                case 2:
                    System.out.println("블랙핑크를 선택하셨네요! 제니 짱 ^ㅅ^");
                    break;

                case 3:
                    System.out.println("이달의소녀를 선택하셨네요! 지우 짱 ^ㅅ^");
                    break;

                case 9:
                    System.out.println("Bye!");
                    scanner.close();
                    break;

                default:
                    System.out.println("없는 메뉴네요!");
                    break;
            }
        } while(menu != 9);
    }
}