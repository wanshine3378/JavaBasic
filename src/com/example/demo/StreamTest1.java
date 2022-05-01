package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 列印1~10
public class StreamTest1 {
	public static void main(String[] args) {
		for(int i=0;i<10; ++i) {
			System.out.println(i);
		}
		
		IntStream.range(0,10).forEach(i -> System.out.println(i));
		
		
		
	}

}
