/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.printthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author thiyagaraja
 */
public class Driver {
    public static void main(String[] args) {
        Printer printer=new Printer();
        ExecutorService executorService=Executors.newFixedThreadPool(100);
        executorService.submit(()-> {
        try{
            printer.printOdd();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        });
        
        executorService.submit(()->{
            try{
                printer.printZero();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        });
        
        executorService.submit(()->{
        try{
            printer.printEven();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        });
        executorService.shutdown();
    }
    
}
