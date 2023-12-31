/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.HashMap;

/**
 *
 * @author thiyagaraja
 */
public class LongestPalindrome {
     public static void main(final String[] args) {
        System.out.println(longestPalindrome("babad"));
       // System.out.println(longestPalindrome("cbbd"));+\
    
    }

    // Time complexity: O(n^2)
    // Space complexity: O(1)
    private static String longestPalindrome(final String s) {
        if (s.length() == 1) return s;

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            final int len1 = expandAroundCenter(s, i, i); // odd length  //babad
            final int len2 = expandAroundCenter(s, i, i + 1); // even length
            final int len = Math.max(len1, len2);
            
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
                 
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(final String s, final int left, final int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;           
            R++;           
        }        
        int v= R - L -1;
        return v;    
    }
    
}
