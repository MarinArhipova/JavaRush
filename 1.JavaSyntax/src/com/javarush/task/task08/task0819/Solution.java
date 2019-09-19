package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        Cat catToRemove = iterator.next();
        cats.remove(catToRemove);
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> ass = new HashSet<>();
        ass.add(new Cat());
        ass.add(new Cat());
        ass.add(new Cat());
        return ass;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat catss: cats)
        System.out.println(catss);
    }

    public static class Cat{
        
    }
}
