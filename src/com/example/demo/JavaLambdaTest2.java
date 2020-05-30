package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import com.example.demo.StringOrder;


//練習openhome.cc的lambda
public class JavaLambdaTest2 {
    public static void main(String[] args) {
        String[] names = {"Justin", "caterpillar", "Bush"};
        //lambda 寫法
        Arrays.sort(names, (name1,name2) -> name1.length()-name2.length());
        //舊的寫法
        Arrays.sort(names, new Comparator<String>() {
            public int compare(String name1, String name2) {
                return name1.length() - name2.length();
            }
        });
        
        Arrays.sort(names, StringOrder::byLength);
        // 列印
        Arrays.asList(names).forEach(System.out::println);
        
        //自製comparator with lambda
        Comparator<String> byLength = (name1, name2) -> name1.length() - name2.length();
        
        
    }

}


