/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class ReverseOrderWords {
    public static void main(String[] args) {
        String s="  Bob    Loves  Alice   ";
    //   String s="a good   example";
        System.out.println(s);
        s=s.trim();
        String t=s.replaceAll("(\\s)+"," ");
        System.out.println(t);
        String[] breakWords=s.replaceAll("(\\s)+"," ").split("\\s");
        for(int i=breakWords.length-1;i>=0;i--){
            System.out.print(breakWords[i]);
            if(i!=0)
                System.out.print(" ");
        }
    }
    
}
