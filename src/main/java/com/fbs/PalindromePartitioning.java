/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiyagaraja
 */
/*
Given a string s, partition s such that every 
substring
 of the partition is a 
palindrome
. Return all possible palindrome partitioning of s.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
*/
public class PalindromePartitioning {
   
    static public void partition(String s, List<String> currentList,List<List<String>> palindromList) {
        System.out.println("s length: "+s.length() + s);
       if(s.length()==0){
           palindromList.add(new ArrayList<>(currentList));
           return;
       }
           
        for(int i=0;i<s.length();i++){
            //System.out.println("Printing");
            
            String s1=s.substring(0,i+1);
          
           
           // System.out.println(checkPalindrome);
            if(isPalindrome(s1)){
                int start=i+1;
                int end= s.length()-1;
                
                int size=end-start+1; 
                System.out.println("Start: "+start+" end:"+end +" size: "+size);
                String remaining=s.substring(i+1, size);
                System.out.println(" Remaining: "+remaining);
                currentList.add(s1); 
                partition(remaining,currentList,palindromList);
                currentList.remove(currentList.size()-1);
            }
        
          //  System.out.println(s.substring(start));
          
          //  palindromList.add(strList);
            
                               
                      
    }
        
   
        
        
       
    }
    static public boolean isPalindrome(String s){
        
        int j=s.length();
        for(int i=0;i<s.length();i++){            
           if(s.charAt(i)!=s.charAt(j-1)){
               return false;
           }
           j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="aab";
        List<List<String>> palindromList=new ArrayList<>();
        partition(s,new ArrayList<>(),palindromList);
        System.out.println(palindromList.toString());
     //   System.out.println(isPalindrome("malayalam"));
    }
}
