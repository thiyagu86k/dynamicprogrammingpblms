/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.Collections;

/**
 *
 * @author thiyagaraja
 */
public class JavaUtilMethods {
    public static void main(String[] args) {
        Thread d=new Thread(()->{
            try{
            Thread.sleep(2000);
            System.out.println("Thread 2");
            System.out.println(Thread.currentThread().getName());
            }catch(Exception e){
                e.printStackTrace();
            }
            });
        try{
            d.start();
        d.join(4000);
            System.out.println(Thread.currentThread().getName());
            System.out.println("Connect to thread");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
