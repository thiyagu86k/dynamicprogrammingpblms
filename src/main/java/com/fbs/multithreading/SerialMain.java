/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.multithreading;

import java.util.Date;

/**
 *
 * @author thiyagaraja
 */
public class SerialMain {
    public static void main(String[] args) { 
 
    double matrix1[][] = MatrixGenerator.generate(2000, 2000); 
    double matrix2[][] = MatrixGenerator.generate(2000, 2000); 
    double resultSerial[][]= new double[matrix1.length]
                                       [matrix2[0].length]; 
 
    Date start=new Date(); 
    SerialMultiplier.multiply(matrix1, matrix2, resultSerial); 
    Date end=new Date(); 
    System.out.printf("Serial: %d%n",end.getTime()-start.getTime()); 
  } 
    
}
