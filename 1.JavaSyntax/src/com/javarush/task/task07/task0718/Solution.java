package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<10; i++) list.add(reader.readLine());
        int a = checkedOrdering(list);
        if(a!=0)
        System.out.println(a);

    }
    
    public static int checkedOrdering(ArrayList<String> list){
         int j=0;
        for (int i=0; i < list.size()-1; i++){
        if (list.get(i).length() > list.get(i+1).length() ) {j=i+1; break;}
        }        return j;
    }
}

