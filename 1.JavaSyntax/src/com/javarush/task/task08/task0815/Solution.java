package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map= new HashMap<>();
        map.put("Иванаев", "Дмитрий");
        map.put("Ивановский", "Паша");
        map.put("Ивановец", "Ира");
        map.put("Иванова", "Татьяна");
        map.put("Иванов", "Алексей");
        map.put("Петров", "Джек");
        map.put("Курепов", "Николас");
        map.put("Петрова", "Ира");
        map.put("Предьков", "Вася");
        map.put("Предько", "Вася");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int i =0;
        for (HashMap.Entry<String, String> entry: map.entrySet()) {
            //if (entry.getKey().containsKey(name)) i++;
            if (name.equals(entry.getValue())) i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int i =0;
        for(HashMap.Entry<String, String> entry: map.entrySet()) {
           // if (entry.getValue().containsValue(lastName)) i++;
            if (lastName.equals(entry.getKey())) i++;
        }
        return i;
    }

    public static void main(String[] args) {

    }
}
