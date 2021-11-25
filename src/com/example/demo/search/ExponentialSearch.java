package com.example.demo.search;

public class ExponentialSearch {
    public static void main(String[] args) {
        
    }
    
    public static int exponentialSearch(final int[] array, final int targetElement) {
        final int length = array.length;
        
        if(length == 0) {
            return -1;
        }
        
        if(targetElement == array[0]) {
            return 0;
        }
        int two = 1;
        
        while(two < length) {
            if(targetElement == array[two]) {
                return two;
            } else if (targetElement < array[two]) {
                return binarySearch(array, targetElement, (two>>1)+1, two -1);
            }
            two <<=1;
        }
        return binarySearch(array, targetElement, (two>>1)+1, length -1);
    }
    
    public static int binarySearch(final int[] array, final int targetElement, int start, int end) {
        while(end >= start) {
            
        }
    }
    
}
