package com.example.demo;

import java.util.ArrayList;
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

    }
}
