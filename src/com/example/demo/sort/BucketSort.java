package com.example.demo.sort;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 非比較排序法的一種
 * 沒有效能上的限制
 * 時間複雜度
 * 最好與平均
 * O ( n+k )
 * 最壞
 * O ( n^2 )
 * 空間複雜度
 * O ( n*k )
 * 原理是將陣列，分散到有限數量的桶子中，
 * 然後每個桶子再個別進行排序，
 * 其中每個桶子的個別排序可以運用其它的演算法來進行排序。
 * 桶子排序法是穩定的。(穩定 1,3,3*,5,10,19，不穩定 1,3*,3,5,10,19
 * 它是常見的排序法中最快的一種，大多數的情況下。
 * 它非常快，但缺點是非常的耗空間。
 * 步驟：
 * 1建立桶子群。
 * 2將資料丟到對應的桶子裡。
 * 3個別桶子進行排序。
 * 4然後在依順序取出結果。
需要計算 有多少個筒子


 */
public class BucketSort {
    
    public static void main(String[] args) {
        int[] arrayX = {3, 19, 25, 77, 50, 100, 333};
        bucketSort(arrayX, 3, 333, 2);
        for(int i: arrayX) {
            System.out.println(i);
        }
       
    }
    
    /**
     * 桶排序法(遞增)。
     */
    public static void bucketSort(final int[] array, final int min, final int max, final int bucketCapacity) {
        
        final int bucketCount = (max - min + bucketCapacity) / bucketCapacity;
     
        final ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
     
        for (int i = 0; i < bucketCount; ++i) {
            final ArrayList<Integer> bucket = new ArrayList<>();
     
            buckets[i] = bucket;
        }
     
        for (final int n : array) {
            final int k = (n - min) / bucketCapacity;
     
            buckets[k].add(n);
        }
     
        int p = 0;
     
        for (final ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
     
            for (final int n : bucket) {
                array[p++] = n;
            }
        }
    }
    
    public static void bucketSortDesc(final int[] array, final int min, final int max, final int bucketCapacity) {
        final int bucketCount = (max - min + bucketCapacity) / bucketCapacity;
     
        final ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
     
        for (int i = 0; i < bucketCount; ++i) {
            final ArrayList<Integer> bucket = new ArrayList<>();
     
            buckets[i] = bucket;
        }
     
        for (final int n : array) {
            final int k = (n - min) / bucketCapacity;
     
            buckets[k].add(n);
        }
     
        int p = 0;
     
        for (int i = bucketCount - 1; i >= 0; --i) {
            final ArrayList<Integer> bucket = buckets[i];
     
            Collections.sort(bucket, (a, b) -> b - a);
     
            for (final int n : bucket) {
                array[p++] = n;
            }
        }
    }

}
