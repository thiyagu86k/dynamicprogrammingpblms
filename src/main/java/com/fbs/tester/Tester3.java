/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.tester;

/**
 *
 * @author thiyagaraja
 */
public class Tester3 {
    public static void main(String[] args) {
        String str="Foot";
        String pattern1="Fo";
       // System.out.println("Pattern: "+pattern(pattern1));
        if(str.matches(patternMaker(pattern1)))
            System.out.println("true");
        
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
       // return "[C][o](.)*[o](.)*";  
        System.out.println(sb.toString());
        return sb.toString();
    }
    
}
