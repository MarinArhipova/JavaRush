package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Dfr", 4535);
        map.put("Dfrds", 74);
        map.put("Dfrssks",788);
        map.put("Dfrsks", 500);
        map.put("Dfrwlj", 67);
        map.put("Dfra", 789);
        map.put("Dfrjdjs", 34567);
        map.put("Dfrjs", 89);
        map.put("Dfskjsr", 23);
        map.put("Dfrjsksskks", 0);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map); //Нельзя проводить одновременно итерацию (перебор)
                                                        // коллекции и изменение ее элементов
        for (Map.Entry<String, Integer> pair: copy.entrySet()){
        if (pair.getValue() < 500) map.remove(pair.getKey());}
    }

    public static void main(String[] args) {

    }
}