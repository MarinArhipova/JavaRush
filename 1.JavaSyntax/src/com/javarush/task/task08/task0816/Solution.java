package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Ивановский", dateFormat.parse("MAY 2 2012"));
        map.put("Ивановец", dateFormat.parse("MAY 3 2012"));
        map.put("Иванова", dateFormat.parse("MAY 6 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 30 2012"));
        map.put("Петров", dateFormat.parse("MAY 7 2012"));
        map.put("Курепов", dateFormat.parse("MAY 8 2012"));
        map.put("Петрова", dateFormat.parse("MAY 9 2012"));
        map.put("Предьков", dateFormat.parse("MAY 10 2012"));
        map.put("Предько", dateFormat.parse("MAY 13 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            int month= itr.next().getValue().getMonth();
            if (month==5 || month==6 || month==7) itr.remove();
        }
    }

    public static void main(String[] args) {

    }
}
