package com.example.demo.sort;
/*
 * 核心概念
 * 先找到一個pivot
 * 然後把比較小的分到左邊 比較大的分到右邊
 * 再針對這兩群下去排序
 * 遞迴的概念
 * 
 * */
public class QuickSort {
    public static void main(String[] args) {
        int[] arrays = {19, 3, 333, 77, 50, 100, 25, 111, 13, 26,19};
        //int[] arrays = {19, 3, 30, 17, 19};
        quickSort(arrays, 0, arrays.length -1);
        for(int x : arrays) {
            System.out.print(x + " ");
        }
       
        
    }
    
    public static void quickSort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int i = left, j = right;
        int pivot = array[left];
        int temp;
        //System.out.println("xxx" + left + " " + right);
        
        while(i != j) {
            while(array[j] > pivot && i < j) {
                j -=1;
            }
            while(array[i] <= pivot && i < j) {
                i += 1;
            }
            if(i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        
            
       
        array[left] = array[i];
        array[i] = pivot;
        
        quickSort(array, left, i-1);
        quickSort(array, i+1,  right);
    }

}
