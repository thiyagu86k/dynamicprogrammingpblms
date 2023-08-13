/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class CoinsChange {
    public static void main(String[] args) {
        int coins[]={1,5,6,9};
        int n=coins.length;
        System.out.println("n size: "+n);
        System.out.println(count(coins, n, 11,'m'));
        
    }
   static int count(int coins[], int n, int sum,char t)
    {
        System.out.println("sum:" + sum +" n:"+n + " Check L or R: "+t);
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
        return count(coins, n - 1, sum,'L') + count(coins, n, sum - coins[n - 1],'R');
        
    }
}
