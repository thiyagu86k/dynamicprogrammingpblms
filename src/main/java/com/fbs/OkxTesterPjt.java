/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fbs;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author thiyagaraja
 */
public class OkxTesterPjt {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
       // ThreadLocal threadLocal=new ThreadLocal();
       ExecutorService executorService=Executors.newFixedThreadPool(4);
       
       executorService.execute(()->{
           System.out.println(LocalDateTime.now());
       
       });
       executorService.shutdown();
        
    }
}
