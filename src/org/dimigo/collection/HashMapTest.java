package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // 2. 맵 계열
        // key, value로 구성
        Map<String, Integer> map = new HashMap<>();
        map.put("kor", 100);
        map.put("mat", 100);
        map.put("eng", 100);
        map.put("eng", 90);
        printMap(map);

        System.out.println(map.get("kor"));
        System.out.println(map.get("sci"));

        map.remove("eng");
        map.clear();
        printMap(map);

        // Map : key(String), value(List<String>)

        Map<String, List<String>> map2 = new HashMap<>();
        List<String> list3 = new ArrayList<>();
        list3.add("노래1"); list3.add("노래2"); list3.add("노래3");
        map2.put("댄스", list3);

        List<Map<String, String>> list4 = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("댄스", "노래1"); map3.put("발라드", "노래2");
    }

    private static void printMap(Map<String, Integer> map) {
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key) + " | ");
        }
        System.out.println();
    }
}