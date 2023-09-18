/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author thiyagaraja
 */
public class LongestSubstringwithoutRepeatedChar {

    public static int lengthOfLongestSubstring(String s) {
        //  Set<Character> charSet= s.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        //return charSet.size();
        
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        System.out.println("next case");
        int strLength = s.length();
        Stack<String> stack=new Stack<>();
        int maxLen=0;
        for (int i = 0; i < strLength; i++) {
            String popString;
            if(stack.isEmpty()){
               popString=new String(); 
                
            }else{
               popString =stack.pop();
            }
            
            char c=s.charAt(i);
            if(popString.length()>0){
                
            if(popString.contains(c+"")){
                stack.push(new String(popString));
                maxLen=Math.max(maxLen, popString.length());
                popString=new String();
            }
            }
            popString=popString+c+"";
            System.out.println(popString);
          
            stack.push(popString);
            if(i==strLength-1){
                System.out.println("yes");
                maxLen=Math.max(maxLen, popString.length());
            }
           // System.out.println(subStr);
        }
      
       /* Set<String> strSet=new HashSet<String>();
        strSet.addAll(stack);
        strSet.stream().forEach(e->{System.out.println(e);});
        */
        
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "dvdf";
    //  String s="pwwkew";
      //  System.out.println(lengthOfLongestSubstring(s,1));
        System.out.println(lengthofLongStr(s));
      /*  Stack<String> st = new Stack<>();
        st.push("hello");
        st.push("test");
        st.push("where");
        System.out.println(st.pop());
*/

    }
    
    public static int lengthOfLongestSubstring(String s,int len) {
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           
            if(!set.contains(s.charAt(right))){
                System.out.println("charat:"+ s.charAt(right));
                System.out.println("left: "+left +"right: "+right);
                set.add(s.charAt(right));
                
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                System.out.println("else condition");
                while(s.charAt(left)!=s.charAt(right)){
                    System.out.println("While loop: left: "+left +" right: "+right);
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
            
        }
        return maxLength;
    }
    
    public static int lengthofLongStr(String s){
        Set<Character> charSet=new HashSet<>();
        int strLen=s.length();
        int j=0;
        int maxLen=0;
        for(int i=0;i<strLen;i++){
            if(!charSet.contains(s.charAt(i))){
                charSet.add(s.charAt(i));
                maxLen=Math.max(maxLen, i-j+1);
            }else{
               charSet.remove(s.charAt(j));
               j++;
               charSet.add(s.charAt(i));
            }
        }
        System.out.println(charSet.toString());
        return maxLen;
    }

}
