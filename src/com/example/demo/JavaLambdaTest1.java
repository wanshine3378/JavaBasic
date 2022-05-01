package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaLambdaTest1 {
    public static void main(String[] args) {
        // the same
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        for(String s :list) {
            System.out.println(s);
        }
        // lambda的寫法 還有過濾的寫法
        list.stream().filter(s -> Integer.valueOf(s) < 3).forEach(s -> System.out.println(s));
        list.forEach(s -> System.out.println(s));
        System.out.println(list.stream().mapToInt(s->Integer.valueOf(s)).sum());
        System.out.println(list.stream().filter(s -> Integer.valueOf(s) < 3).mapToInt(s->Integer.valueOf(s)).average().getAsDouble());

        String[] names = {"Justin", "Torres", "Sandy"};
        // openhome的
        Arrays.sort(names, (String name1, String name2) -> name1.length() - name2.length());
        
        // 原始runnable
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("test runnable");
            }
        };
        
        Thread t = new Thread(run);
        t.start();
        
        // lambda
        Runnable run1 = () -> System.out.println("test runnable1");
        
        
    }
}
