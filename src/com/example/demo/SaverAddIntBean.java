package com.example.demo;
import java.io.*;

public class SaverAddIntBean {
    public static void main(String[] args) {
        new SaverAddIntBean().write();
    }
    public void write() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        AddInt ai = new AddInt();
        ai.calc(1, 2, 3, 4);
        String path = "src/com/example/demo/IntBean.ser";
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ai);
            System.out.println("Sucessfully");
        } catch(Exception e) {
            System.out.println("Error");
        } finally {
            try {
                oos.close();
                fos.close();
            } catch(IOException e) {}
        }
    }
}
