/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.tester;

/**
 *
 * @author thiyagaraja
 */
public class PalindromeShrt {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("121  ");
        
      int x1= Integer.parseInt(sb.toString());
     int y1=Integer.parseInt(sb.reverse().toString());
    
        
     if(x1==y1){
         System.out.println("Number is Palindrome");
     }else{
         System.out.println("Number is not palindrome");
     }
     
    }
    
}
