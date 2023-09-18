/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class CronosSolutions2 {
     public static void main(String[] args) {
     /*   System.out.println(checkPalindromeFormation("abcdef", "eeecba")); // Output: true*/
     //   System.out.println(checkPalindromeFormation("abcdef", "xxxxba")); // Output: true
   //     System.out.println(checkPalindromeFormation("abcde", "xxxba")); // Output: true
  //      System.out.println(checkPalindromeFormation("abcde", "xxxca")); // Output: false
   //     System.out.println(checkPalindromeFormation("abcde", "xxxdc")); // Output: false

         System.out.println(checkPalindromeFormation("ulacfddd", "ddjizalu"));
    }

    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private static boolean check(String a, String b) {
        System.out.println("a: "+a +" b: "+b);
        int i = 0, j = b.length() - 1;
      
        while (i < j && a.charAt(i) == b.charAt(j)) {
           
            System.out.println("i: "+i + " j: "+j);
            i++;
            j--;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        System.out.println("String: "+s + " i:"+i +"j: "+j);
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                System.out.println("f");
                return false;
            }
        }
        System.out.println("t");
        return true;
    }
    
}
