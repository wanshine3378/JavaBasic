package com.example.demo;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import java.util.concurrent.atomic.AtomicInteger;
//使用filter限制請求最大併發數
public class ConcurrentCountFilter implements Filter{
    private static AtomicInteger count = new AtomicIntege(0);
    // 取得目前並發數
    public static int get() {
        return count.get();
    }
    
    public static int increase() {
        return count.incrementAndGet();
    }
    
    public static int decrement() {
        return count.decrementAndGet();
    }
    
    private int maxConcurrent = -1;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String maxStr = filterConfig.getInitParameter("maxConcurrent");
        int num = -1;
        if(maxStr != null &&!"".equals(maxStr)) {
            try {
                num = Integer.parseInt(maxStr);
            } catch(NumberFormatException e) {
                
            }
        
        }
        if(num >= 1) {
            this.maxConcurrent = num;
        }else{
            this.maxConcurrent = -1;
        }
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {
            int num = increase();
            if(maxConcurrent > 0 ) {
                if(maxConcurrent >= num ) {
                    chain.doFilter(request, response);
                } else {
                    HttpServletResponse res = (HttpServletResponse) response ;
                    res.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "errorMsg");
                }
            } else {
                chain.doFilter(request, response);
            }
        } finally {
            decrement();
        }
        }
        
        
        
         
    }

    @Override
    public void destroy() {
        
    }
    
    
    <pre name="code" class="java">
    public class ServiceFilter implements Filter {
        private static final int MAX_COUNT = 20;
        private int filterCount = 0;
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException { 
            System.out.println("before"+filterCount); 
            if(filterCount > MAX_COUNT) { 
                //請求個數太多,跳轉到排隊頁面 
                request.getRequestDispatcher("index.jsp").forward(request, response); }
            else { //請求個數加1 filterCount ++; chain.doFilter(request, response);
                //訪問結束,請求個數減1 
                filterCount --; } }
        }
    }
    

}
