/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class LongestPalindromeThiyaguVersion {
    public static void main(String[] args) {
    String palindromText="babad";
        System.out.println(longestPalindrome(palindromText));
    
    
  }
    
    public static String longestPalindrome(String s) {
		int n = s.length();
		int start=0, end=0;
                int maxPalindromStringLengthUntil=0;
		boolean[][] dp = new boolean[n][n];
               /*  for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(dp[i][j]+" ");
                    }
                    System.out.println("\n");
                }
*/
		for (int i=n-1;i>=0;i--) {
			for(int j=i; j<n; j++) {
                            System.out.println(s.charAt(i) +" i="+i +"\t" + s.charAt(j )+" j= "+j);
                            // System.out.print(dp[i][j]+" ");
				dp[i][j]=s.charAt(i)==s.charAt(j) && (j-i<2||dp[i+1][j-1]);
                                
				if(dp[i][j]==true && j-i>maxPalindromStringLengthUntil) {
                                    System.out.println("some condition it print");
					start=i;
					end=j;
                                        maxPalindromStringLengthUntil=end-start;
                                        System.out.println("Highest Palindrome Count: "+maxPalindromStringLengthUntil);
                                        System.out.println("end="+end + " start="+start);
				}
			}
                        System.out.print("\n");
                        System.out.println("=====================");
		}
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(dp[i][j]+" ");
                    }
                    System.out.println("\n");
                }

		return n==0?"":s.substring(start, end+1);
	}
    
    
    
}
