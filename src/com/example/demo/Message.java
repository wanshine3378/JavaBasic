package com.example.demo;


/* java8 新增的annotation
宣告後就代表代表這是一個函式介面
就只能宣告一個抽象方法
兩個以上就是錯的

*/
@FunctionalInterface
public interface Message {
    public abstract void hello(String msg); // abstract 可寫可不寫
    
    static void show2() {
        
    }
    // 如果去掉default 什麼都沒寫預設就是abstract 所以錯誤
    default void show3() {
        
    }
}
