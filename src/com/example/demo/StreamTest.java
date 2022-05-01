package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // 不用Stream
        for(int i = 0; i < 10; i++) {
            System.out.println("i");
        }
        
        // 用Stream
        IntStream.range(0,10).forEach(i -> System.out.println(i));
        
        IntStream.range(0, 10).forEach(System.out::println);
        
        // collect 的stream 
        List<String> names = Stream.of("Tony", "John", "Tom").collect(Collectors.toList());
        List<String> names2 = Arrays.asList("Tony", "Tom", "John");
        System.out.println(names.toString());
        System.out.println(names2.toString());
        
        Set<String> names3 = Stream.of("Sandy", "Cindy", "Mia").collect(Collectors.toSet());
        System.out.println(names3.toString());
        
        // foreach vs Stream.map
        // foreach
        List<String> names4 = new ArrayList< >();
        for (String name : Arrays.asList("tony", "tom", "john")) {
            String upperName = name.toUpperCase();
        }
        
        
    }
    
 // Collectors.joining
    /*
    private void stringJoinUseStringBuilder() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        for(Product p : productList) {
            String name = p.name;
            sb.append(name);
            if(++i < productList.size()) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
        
    }*/
    

    
    
    
    
    
    

}
