package com.example.demo;

import java.io.File;
import java.io.IOException;

// 練習檔案的程式

public class FilePrac {
    public void main (String[] args ) {
        String separator = File.separator;
        String file = "file.txt";
        String directory = "dirA" + separator + "dirB";
        
        File f = new File(directory, file);
        if(f.exists()) {
         System.out.println("文件名 ： " + f.getAbsolutePath());
         System.out.println("檔案長度");
        } else { 
            f.getParentFile().mkdirs();
            try {
                f.createNewFile();
            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
