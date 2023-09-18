/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author thiyagaraja
 */
public class JavaExecutorService {
    public static void main(String[] args) {
        System.out.println("No of cores:"+ Runtime.getRuntime().availableProcessors());
        
        ExecutorService exService=Executors.newFixedThreadPool(12*2);
        for(int i=0;i<50;i++){
            exService.execute(()->{
                System.out.println("Printing document by thread: " +Thread.currentThread().getName());
                try{
                    Thread.sleep(1000l);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            });
        }
        exService.shutdown();
        
    }
    
}
