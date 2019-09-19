package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
Написать 5 методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его,
полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        System.out.println(name);
        return name;
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name = stackTraceElements[2].getMethodName();
        //0-ой индекс - getStackTrace, 1-ый - ВСЕГДА текущий метод независимо от уровня вложенности,
        //а дальше по принципу матрешки (вложенности методов). Т.к. по условию задачи требуется вывести
        //имя вызвавшего метода, то для всех методов это 2ой индекс.
        System.out.println(name);
        return name;
    }
}
