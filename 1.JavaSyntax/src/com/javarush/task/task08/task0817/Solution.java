package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> maps = new HashMap<>();
        maps.put("ert", "TRYEU");
        maps.put("erCXVt", "TRYjsEU");
        maps.put("ertVZ", "TRYdjjEU");
        maps.put("ertSA", "TRhfYEU");
        maps.put("ertEW", "TRYEU");
        maps.put("ertEWEW", "TRYEUfj");
        maps.put("ertTRY", "TRYEUdhsjs");
        maps.put("ertHRJJR", "TRYEUksk");
        maps.put("ertERE", "TRYEUjskl");
        maps.put("ejjsrtERE", "TRYEUssjskl");
        return maps;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List valueList = new ArrayList(map.values());
        for (int i = 0; i < valueList.size() - 1; i++)
            for (int j = i + 1; j < valueList.size() - 1; j++) {
                if (valueList.get(i).equals(valueList.get(j))) removeItemFromMapByValue(map, (String) valueList.get(i));
            }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
