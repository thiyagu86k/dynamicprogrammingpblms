/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.multithreading;

import java.util.Random;

/**
 *
 * @author thiyagaraja
 */
public class MatrixGenerator {
    public static double[][] generate(int rows,int columns){
        double[][] ret=new double[rows][columns];
        Random random=new Random();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                ret[i][j]=random.nextDouble()*10;
            }
        }
        return ret;
    }
    
}
