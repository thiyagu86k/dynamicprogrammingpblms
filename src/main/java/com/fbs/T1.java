/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println(hello(0.0));
    }
    public static double hello(double x){
	try{
		double y=  1.0/x;
                System.out.println("Before exception"+y);
                return y;
	}catch(Exception e){
            System.out.println("Exceptions is thrown");
		return 1;
	}
	finally{
	 	return 2;
	}
}

    
}
