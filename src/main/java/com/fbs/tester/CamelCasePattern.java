/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.tester;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiyagaraja
 */
public class CamelCasePattern {

    public static void main(String[] args) {
        List<Boolean> outputList = camelMatchLeetCode(new String[]{"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"}, "FoBaT");
   //    List<Boolean> outputList=camelMatch(new String[]{"CompetitiveProgramming","CounterPick","ControlPanel"}, "CooP");
       System.out.println(outputList);
    }
    
    
public static List<Boolean> camelMatchNewApproach(String[] queries, String pattern) {
    List<Boolean> camelMatchList=new ArrayList<>();
    for(String query:queries){
        boolean match=isMatched(query.toCharArray(),pattern.toCharArray())
    }
    
}
private static boolean isMatched(char[] toCharArray, char[] toCharArray0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> camelMatchList=new ArrayList<>();
        List<String> patternList=patterExtractor(pattern);
        for(String s: queries){
          List<String> splitedString=patterExtractor(s);
          if(patternList.size()==splitedString.size()){
              boolean truePatten=false;
              for(int k=0;k<splitedString.size();k++){
                  String first=patternList.get(k);
                  String queriesI=splitedString.get(k);
                  if(queriesI.matches(patternMaker(first))){
                 // if(queriesI.startsWith(first)){
                      truePatten=true;
                  }else{
                      
                      truePatten=false;
                      camelMatchList.add(false);
                      break;
                  }
              }
              if(truePatten)
                  camelMatchList.add(true);
          }else{
              camelMatchList.add(false);
          }
            
        }
      
        return camelMatchList;
    }
    
    public static List<String> patterExtractor(String str){
        List<String> patternList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                if (sb.length() > 0) {
                    patternList.add(sb.toString());
                }
                sb.setLength(0);
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        if (sb.length() > 0) {
            patternList.add(sb.toString());
        }
        return patternList;
    }
    
    public static String patternMaker(String pt){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<pt.length();i++){
            if(Character.isUpperCase(pt.charAt(i))){
                sb.append("["+pt.charAt(i)+"]");
            }else{
                sb.append("(.)*");
                sb.append("["+pt.charAt(i)+"]");
            }
            
        }
        sb.append("(.)*");         
        return sb.toString();
    }
    
    
    public static List<Boolean> camelMatchLeetCode(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();
        
        char[] patternArr = pattern.toCharArray();
        for (String query : queries) {
            boolean isMatch = match(query.toCharArray(), patternArr);
            res.add(isMatch);
        }
        
        return res;
    }
    
    private static boolean match(char[] queryArr, char[] patternArr) {
        int j = 0;
        for (int i = 0; i < queryArr.length; i++) {
            if (j < patternArr.length && queryArr[i] == patternArr[j]) {
          //      System.out.println(patternArr[j]+" Querry[i]: "+queryArr[i]);
                j++;
            } else if (queryArr[i] >= 'A' && queryArr[i] <= 'Z') {
                return false;
            }
            
        }
        
        return j == patternArr.length;
    }

    

}
