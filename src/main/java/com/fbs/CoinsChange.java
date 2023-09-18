/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 * @author thiyagaraja
 */
public class CoinsChange {
    public static void main(String[] args) {
        int coins[]={1,2,3};
        int n=coins.length;
        System.out.println("n size: "+n);
        System.out.println(count(coins, n, 4,'m'));
        new ArrayList<>();
        String s="abcabcbb";
        
        

   
      
    
      
       Set<Character> charSet=new HashSet<>();
       charSet.addAll(charList);
        
    }
   static int count(int coins[], int n, int sum,char t)
    {
        System.out.println("sum:" + sum +" n:"+n + " Check L or R: "+t);
//        StackTraceElement[] stcList=Thread.currentThread().getStackTrace();
//        for(StackTraceElement stc:stcList){
//            System.out.println(stc.getMethodName()+"; "+stc.getLineNumber());
//        }
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0)
            return 1;
 
        // If sum is less than 0 then no
        // solution exists
        if (sum < 0)
            return 0;
 
        // If there are no coins and sum
        // is greater than 0, then no
        // solution exist
        if (n <= 0)
            return 0;
 
        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return count(coins, n, sum - coins[n-1],'L') + count(coins, n - 1, sum,'R')  ;
        
    }
}
