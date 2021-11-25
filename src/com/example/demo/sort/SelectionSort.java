package com.example.demo.sort;
/*
 * selection sort
 * 找到最小值 丟到最旁邊
 * */
public class SelectionSort {
    public static void main(String[] args) {
        int[] tempArray = {9, 4, 3, 1, 7, 8, 6};
        SortArray sortArray = new SortArray(tempArray); 
        sortArray.selectionSort(tempArray);
        for(int temp : tempArray) {
            System.out.println(temp);
        }
    }

}

class SortArray {
    public SortArray(int[] arrray) {
        this.array = arrray;
    }
    int [] array;
    int[] selectionSort(int[] array) {
        int length = array.length;
        int min = 0;
        int index = 0; 
        boolean change = false;
        //System.out.println(length);
        for(int i = 0; i < length; i++) {
            min = array[i];
            for(int j=i+1; j <length; j++) {
                //System.out.print(j);
                if(array[j] < min) {
                    
                    //min = array[j];
                    index = j;
                    change = true;
                } 
            }
            if(change == true)
            swap(i, index, array);
            change = false;
        }
        return array;
    }
    void swap(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
    }
    
}

