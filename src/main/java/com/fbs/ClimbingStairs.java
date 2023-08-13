/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class ClimbingStairs {
    public static void main(final String[] args) {
        System.out.println(climbStairs(6));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    private static int climbStairs(final int n) {
        final int[] dp = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            System.out.println("i="+i);
            dp[i] = dp[i + 1] + dp[i + 2];
        }
        
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
System.out.println(" ");
        return dp[0];
    }

    
}
