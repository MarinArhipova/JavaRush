package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	String[] words = s.split("\\s"); // Разбиение строки на слова с помощью разграничителя
      for(String subStr:words) {
	if (subStr.equals("exit")) break; 
	else{ t = Integer.parseInt(subStr);
	}
      }
      
}
    }
}
