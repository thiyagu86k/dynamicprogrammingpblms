/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class CoinChangeWithExponentialSol {
   // The solution have issue it provide duplicate ways of set 
    public static void main(String[] args) {
        int[] S={1,2,3};
        int target=4;
        System.out.println("The total number of ways: "+count(S,target));
    }

    private static int count(int[] S, int target) {
        if(target ==0)
               return 1;
        if(target <0)
            return 0;
        int result=0;
        for(int c:S){
            System.out.println("Number:"+c +" result: "+result +" target: "+target );
            result += count(S,target-c);
        }
        return result;
    }
    
}
