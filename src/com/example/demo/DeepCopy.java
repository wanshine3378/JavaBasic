package com.example.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class DeepCopy {
    public static void main(String[] args) {
        
        Vector original = new Vector();
        
        StringBuffer text = new StringBuffer("the quick borwn fox");
        original.addElement(text);
        
        
        Vector clone = (Vector) original.clone();
        
        System.out.println("A. After cloning");
        printVectorContents(original, "original");
        printVectorContents(clone, "clone");
        
        clone.addElement(new Integer(5));
        System.out.println("B. after adding an Integer to the clone");
        printVectorContents(original, "original");
        printVectorContents(clone, "clone");
        
        
        text.append(" jumps over the lazy dog");
        System.out.println("C after modifying one of original's elements");
        printVectorContents(original, "original");
        printVectorContents(clone, "clone");
        
        
        
        
       
        
        
        
        
        
        
        
    }
    public static void printVectorContents (Vector v, String name) {
        System.out.println(" Contents of \"" + name + "\":");
        
        for(int i = 0; i < v.size(); i++) {
            Object element = v.elementAt(i);
            System.out.println("   " + i +" ( " + 
                element.getClass().getName() + "):" +
                element);
        }
        System.out.println();
    }
    
    public static Object copy(Object orig) {
        Object obj = null;
        try {
            // Write the object out to a byte array
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(orig);
            out.flush();
            out.close();
            
            //Make an input Stream from the byte array and read
            //a copy of the object back in.
            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bos.toByteArray()));
            obj = in.readObject();    
        } 
        catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        return obj; 
    }

}
