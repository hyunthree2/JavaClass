package org.dimigo.collection;

import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1. List 계열 : ArrayList
        List list = new ArrayList();
        //list.add(Object e) object라서 모든 걸 담을 수 있음
        list.add("나자바");
        list.add(100);
        list.add(new Dog("멍멍이"));

        String str = (String) list.get(0); // 넣는 순서대로, 0=나자바

        // 제네릭 -> List에 들어가는 형식을 <>로 지정
        List<String> list2 = new ArrayList<>();
        list2.add("사과");
        list2.add("배");
        list2.add("딸기");
        list2.add("딸기");
        list2.add(1,"포도"); // 1번 인덱스에 포도를 넣음
        list2.set(2,"바나나"); // 2번 인덱스를 바나나로 바꿈
        printList(list2);

        System.out.println(list2.get(0));
        System.out.println(list2.get(list2.size() - 1));
        list2.remove(0); // 한 칸씩 앞으로 다 땡겨짐
        printList(list2);
        list2.remove("딸기"); // 앞에 있는 딸기만 지움
        printList(list2);
        list2.clear(); // 리스트 전체 삭제
        printList(list2);
    }

    private static void printList(List<String> list2) {
        for(String s : list2) {
            System.out.print(s + " | ");
        }
        System.out.println();
    }
}