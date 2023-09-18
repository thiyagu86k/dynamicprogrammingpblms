/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class InterleavingStr {
    static long count=0;

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        s1="cbcccbabbccbbcccbbbcabbbabcababbbbbbaccaccbabbaacbaabbbc";
        s2="abcbbcaababccacbaaaccbabaabbaaabcbababbcccbbabbbcbbb";
        s3= "abcbcccbacbbbbccbcbcacacbbbbacabbbabbcacbcaabcbaaacbcbbbabbbaacacbbaaaabccbcbaabbbaaabbcccbcbabababbbcbbbcbb";
        System.out.println(isInterleave(s1, s2, s3));
        System.out.println("How many times isInterleave executed: "+count);
    }

     public static boolean isInterleave(String s1, String s2, String s3) {
         count++;
       
         if(s1.isEmpty() && s2.isEmpty() && s3.isEmpty()){
             return  true;
         }
       
         if(s3.isEmpty()){
            return false; 
         }
       //  System.out.println("s1: "+s1+ "\ts2: "+s2 +"\ts3: "+ s3);
          boolean val1=false;
          boolean val2=false;
          if(s1.length()>0){
             val1 =(s3.charAt(0)==s1.charAt(0) &&  isInterleave(s1.substring(1), s2, s3.substring(1))) ;
          }
          if(s2.length()>0){
         
          val2=(s3.charAt(0)==s2.charAt(0) && isInterleave(s1, s2.substring(1), s3.substring(1)));
          
          }
         
          boolean val= val1 || val2;
      
          return val;
    }
     
   /* public static boolean isInterleave(String s1, String s2, String s3) {
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < s3.length(); i++) {
           
            if (aIndex <= s1.length() - 1 && s3.charAt(i) == s1.charAt(aIndex)) {
                System.out.println("i= " + i + " s3 Char: " + s3.charAt(i)+ " AIndex:= " + s3.charAt(i) + " Index Value: " + aIndex);
                aIndex = aIndex + 1;
                //i++;
            } else if (bIndex <= s2.length() - 1 && s3.charAt(i) == s2.charAt(bIndex)) {
                System.out.println("i= " + i + " s3 Char: " + s3.charAt(i)+ " BIndex:= " + s3.charAt(i) + " Index Value: " + bIndex);
                bIndex = bIndex + 1;
                // i++;

            } else {
                // i++;
                System.out.println("else condition "+" i= " + i + " s3 Char: " + s3.charAt(i));
                if (bIndex <= s2.length() - 1 && i < s3.length()) {
                    String s4 = s2.substring(bIndex);
                    if(checkChar(s4, s3.charAt(i))==false)
                        return false;

                }
                
                //  System.out.println("Not Matched "+s3.charAt(i) +" i="+i);
            }
        }

        return true;
    }

    private static boolean checkChar(String subStr, char i) {
        for (int j = 0; j < subStr.length(); j++) {
            if (subStr.charAt(j) == i) {
                return true;
            }

        }
        return false;

    }
*/

}
