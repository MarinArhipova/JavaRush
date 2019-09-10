package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        //Вывести на экран текущую дату в аналогичном виде "21 02 2014".

System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        //        Date d = new Date();
        //        SimpleDateFormat f = new SimpleDateFormat("dd MM yyy");
        //        System.out.println(f.format(d));
    }
}
