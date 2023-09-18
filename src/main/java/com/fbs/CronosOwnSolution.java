/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class CronosOwnSolution {
    public static void main(String[] args) {
        String a="x";
        String b="y";
        if(a.length()==0 && b.length()==0)
            System.out.println( true);
        
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        
        int j=b1.length;
        for(int i=0;i<b.length();i++){
            b1[i]=b.charAt(j-1);
            j--;
        }
       
        int k=0;
        for(int i=0;i<a.length();i++){
            if(a1[i]==b1[i]){
                k++;
            }
        }
        if(k>1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
