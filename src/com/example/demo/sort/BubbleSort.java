package com.example.demo.sort;

/*
 *1.比較相鄰的元素 如果比較小 就交換
 *2.對每一對相鄰元素執行 做完後最後一個就是最小的
 *3.排除最後一個元素重複上述步驟
 *最佳時間複雜度o(n)
 *平均o(n^2)
 *
*/
public class BubbleSort {
    public static void main(String[] args) {
        BubbleArray bArray = new BubbleArray();
        int[] tempArray = {9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for(int tempN : tempArray) {
            System.out.println(tempN);
        }
        bArray.setArray(tempArray);
        bArray.bubbleSort(tempArray);
        for(int temp : tempArray) {
            System.out.println(temp);
        }
        
    }
}

class BubbleArray {
    public int[] arrary;
    int[] bubbleSort(int[] array) {
        int length = array.length;
        int temp;
        while(length-1 > 0) {
            length--;
            for(int i = 0; i < length; i ++) {
                if(array[i] > array[i+1]) {
                    temp = array[i+1];
                    array[i+1] = arrary[i];
                    array[i] = temp;
                }           
            }
            
        }
        return array;
    }
    public int[] getArray() {
        return this.arrary;
    }
    public void setArray(int[] array) {
        this.arrary = array;
    } 
}