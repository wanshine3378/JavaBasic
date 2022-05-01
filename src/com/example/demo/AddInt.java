package com.example.demo;
import java.io.*;

public class AddInt implements Serializable {
    private int sum = 0;
    public void calc(int... c) {
        for(int i=0;i<c.length;i++) {
            sum +=c[i];
        }
    }
    public int getSum() {
        return sum;
    }
    
}
