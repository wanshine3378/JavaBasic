package com.example.demo.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<String> names = new ArrayList();
		
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
	
		names.forEach(System.out::println);
	}

}
