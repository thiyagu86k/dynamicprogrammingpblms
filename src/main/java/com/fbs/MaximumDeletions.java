/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class MaximumDeletions {
    public static void main(String[] args) {
        
        System.out.println("\n\n"+solution("BAAABAB"));
    }
    public static int solution(String S) {
        int N = S.length();
        int[] prefixB = new int[N + 1];
        int[] suffixA = new int[N + 1];
        for(int i=0;i<prefixB.length;i++){
            System.out.print(prefixB[i]+"\t");
        }
        System.out.println("\n");
        // Count prefix 'B's
        for (int i = 0; i < N; i++) {
            prefixB[i + 1] = prefixB[i] + (S.charAt(i) == 'B' ? 1 : 0);
            
        }
        for(int i=0;i<prefixB.length;i++){
            System.out.print(prefixB[i]+" ");
        }
        
        // Count suffix 'A's
        for (int i = N - 1; i >= 0; i--) {
            suffixA[i] = suffixA[i + 1] + (S.charAt(i) == 'A' ? 1 : 0);
        }
         System.out.println("\n\n Suffix A");
        for(int i=0;i<suffixA.length;i++){
            System.out.print(suffixA[i]+" ");
        }
         System.out.println("\n");
        // Calculate minimum deletions
        int minDeletions = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++) {
            System.out.println("prefixB= "+prefixB[i]+" suffixA= "+suffixA[i]+"\tTotal="+(prefixB[i]+suffixA[i])+" MinDeletions= "+minDeletions);
            minDeletions = Math.min(minDeletions, prefixB[i] + suffixA[i]);
        }
        
        return minDeletions;
    }
    
}
