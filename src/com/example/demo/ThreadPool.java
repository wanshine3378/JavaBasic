package com.example.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class ThreadPool {
    public static void main (String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        
        executor.execute(new Work(1));
        
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "Begins Work in anonymous inner class");
            }
        });
    }
    
    public static class Work implements Runnable {
        private int id;
        
        public Work(int id) {
            this.id = id;
        }
        
        public void run() {
            System.out.println(Thread.currentThread().getName() + "Begins Work" + id);
            try {
                Thread.sleep(5000);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "End Work" + id);
        }
        
    }
}
