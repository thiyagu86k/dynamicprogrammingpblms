/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class CronosSolution3 {
    
    public static boolean canFormPalindrome(String a, String b) {
    for (int i = 0; i < a.length(); i++) {
      String aPrefix = a.substring(0, i);
      String aSuffix = a.substring(i);

      String bPrefix = b.substring(0, i); 
      String bSuffix = b.substring(i);

      String palindrome1 = aPrefix + bSuffix;
      String palindrome2 = bPrefix + aSuffix;
        System.out.println("aPrefix + bSuffix: "+palindrome1);
        System.out.println("bPrefix + aSuffix: "+palindrome2);
      if (isPalindrome(palindrome1) || isPalindrome(palindrome2)) {
        return true;
      }
    }
    return false;
  }

  public static boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String a = "abcdef";
   String b = "eeecba";
//    System.out.println(canFormPalindrome(a, b)); // true
//
//    a = "abcde";
//    b = "xxxba"; 
//    System.out.println(canFormPalindrome(a, b)); // true

 //   String a = "ulacfddd";
  //  String  b = "ddjizalu";
    System.out.println(canFormPalindrome(a, b)); // false
  }
    
}
