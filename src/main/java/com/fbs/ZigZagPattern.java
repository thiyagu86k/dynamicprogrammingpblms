/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
/**
 * 
 *The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 

Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */
public class ZigZagPattern {
    public static void main(String[] args) {
       
        
        System.out.println(convert("ABC", 2));
        
    }
    public static String convert(String s, int numRows) {
        if(numRows==1 || s.length()==1)
            return s;
        int totalColumns=Math.round(s.length()/2f);
        System.out.println(totalColumns);
        char[][] zigzagChr=new char[numRows][totalColumns];
        int chari=0;
        int columns=0;
        
        int placeRow=numRows-1;
        
      
        first:{ while(columns<totalColumns){
            for(int row=0;row<numRows;row++){
                if(placeRow==numRows-1){
                      if(chari==s.length())
                          break first;  
               
             zigzagChr[row][columns]=s.charAt(chari);
               
             chari++;
                }else{
                    if(chari==s.length())
                          break first;  
                    
                    zigzagChr[placeRow][columns]=s.charAt(chari);
                    chari++;
                    break;
                }
             
             
            }
            placeRow--;
            
            if(placeRow==0){
                
                placeRow=numRows-1;
            }
             columns++;
        }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<totalColumns;j++){
                if(zigzagChr[i][j]!='\0'){
                     sb.append(zigzagChr[i][j]);
                }
            }
        }

        return sb.toString();
    }
    
}
