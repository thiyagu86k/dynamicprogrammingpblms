/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.multithreading;

/**
 *
 * @author thiyagaraja
 */
public class SerialMultiplier {
    public static void multiply (double[][] matrix1, double[][] matrix2,
                               double[][] result) { 
    int rows1=matrix1.length; 
    int columns1=matrix1[0].length; 
 
    int columns2=matrix2[0].length; 
 
    for (int i=0; i<rows1; i++) { 
      for (int j=0; j<columns2; j++) { 
        result[i][j]=0; 
        for (int k=0; k<columns1; k++) { 
          result[i][j]+=matrix1[i][k]*matrix2[k][j]; 
        } 
      } 
    } 
  } 
    
}
