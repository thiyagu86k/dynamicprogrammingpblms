/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author thiyagaraja
 */
public class ExecutorTest {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("run...");
       // Executor executor=Executors.newSingleThreadExecutor();
        //executor.execute(runnable);
        ExecutorService ex=Executors.newFixedThreadPool(4);
        ex.submit(runnable);
        ex.shutdown();
        
        
    }
    
}
