package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ввод:http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:lvl view name
Пример 2 Ввод:http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        
        String[] sSplit = s.split("&");
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(s);
        matcher.find();
        System.out.println(matcher);

        /*boolean b = matcher.find();
        if (b) {
            int start = matcher.start();
            int finish = matcher.end();
            System.out.println(start + " " + finish);*/
        }




    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
