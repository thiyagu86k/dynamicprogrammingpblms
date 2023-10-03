/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.windowsliding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author thiyagaraja
 */
public class LongestSubStringThiyaguVersion {
    public static void main(String[] args) {
        System.out.println(findLogestSubString("abcbdbdbbdcdabd", 2));
        
    }
    public static String findLogestSubString(String s,int k){
        if(s==null || s.length()==0)
            return s;
        int strLeng=s.length();
        Map<Character,List<Integer>> maxMap=new HashMap<>(k);
        Map<Integer,Integer> minMaxPosition=new HashMap<>();
        for(int i=0;i<strLeng;i++){
           List<Integer> positionList= maxMap.getOrDefault(s.charAt(i), new ArrayList<Integer>());
           positionList.add(i);
           maxMap.put(s.charAt(i), positionList);
           if(maxMap.size()>k){
               maxMap.remove(s.charAt(i));
              List<Integer> pl= maxMap.values().stream().flatMap(list->list.stream()).collect(Collectors.toList());
            
              minMaxPosition.put(Collections.min(pl), Collections.max(pl));
               maxMap.clear();
           }
            
        }
        
        int findMaxPositionElement=0;
        int maxPostionElement=0;
        for(Integer i: minMaxPosition.keySet()){
            int highVal=minMaxPosition.get(i);
            int maxPos=highVal-i;
            maxPostionElement=Math.max(maxPostionElement, maxPos);
            if(maxPos==maxPostionElement){
                findMaxPositionElement=i;
            }   
                     
        }
       
       
        return s.substring(findMaxPositionElement, minMaxPosition.get(findMaxPositionElement)+1);
    }
}
