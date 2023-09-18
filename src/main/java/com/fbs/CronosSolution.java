/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class CronosSolution {
     static public boolean checkPalindromeFormation(String a, String b) {
        int n = a.length();
        for (int i = 0; i < n; i++) {
            System.out.println("a: "+a.substring(0,i) + " b: "+b.substring(i,n));
            String a1 = a.substring(0, i) + b.substring(i, n);
            System.out.println("b: "+b.substring(0,i) + " a: "+a.substring(i, n));
            String b1 = b.substring(0, i) + a.substring(i, n);
            if (isPalindrome(a1) || isPalindrome(b1)) {
                return true;
            }
        }
        return false;
    }

    static private boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="abcde";
        String b="xxxca";
        System.out.println(checkPalindromeFormation(a, b));
       // Collections.
    }
    
}
