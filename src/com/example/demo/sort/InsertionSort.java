package com.example.demo.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void Sort(int[] array) {
        List<Integer> sorted = new ArrayList<Integer>(array.length);
        for(int i=0; i<array.length;++i)
        {
            int n = array[i];//asdfasdf
            int index = sorted.size() - 1;
            while(index >= 0 && sorted.get(index)>n)
                --index;
            sorted.add(index+1, n);
        }
        for(int i=0; i<array.length;i++) {
        	array[i] = sorted.get(i);
        }
    }
}
