/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.tester;

/**
 *
 * @author thiyagaraja
 */
public class ArrayTester {
    public static void main(String[] args) {
        int[] test=new int[200];
        for(int i=0;i<200;i++){
            test[i]++;
        }
        char a='a';
        int t1=a;
        System.out.println(t1);
        System.out.println(5>4);
        String s="abcbdbdbbdcdabd";
        System.out.println(s.substring(3, 9));
        int k=2;
        for(int v=0;v<k;v++){
            System.out.println("Loop Tester: "+v);
        }
        
        int decodedLength=12;
        int k1=10;
        k1 %=decodedLength;
        System.out.println(k1);
       int t=100%10;
        System.out.println("t: "+t);
    }
    
}
