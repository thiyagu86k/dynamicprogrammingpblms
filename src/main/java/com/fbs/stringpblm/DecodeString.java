/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.stringpblm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author thiyagaraja
 */
/**
 *
 * You are given an encoded string s. To decode the string to a tape, the
 * encoded string is read one character at a time and the following steps are
 * taken:
 *
 * If the character read is a letter, that letter is written onto the tape. If
 * the character read is a digit d, the entire current tape is repeatedly
 * written d - 1 more times in total. Given an integer k, return the kth letter
 * (1-indexed) in the decoded string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leet2code3", k = 10 Output: "o" Explanation: The decoded string
 * is "leetleetcodeleetleetcodeleetleetcode". The 10th letter in the string is
 * "o". Example 2:
 *
 * Input: s = "ha22", k = 5 Output: "h" Explanation: The decoded string is
 * "hahahaha". The 5th letter is "h". Example 3:
 *
 * Input: s = "a2345678999999999999999", k = 1 Output: "a" Explanation: The
 * decoded string is "a" repeated 8301530446056247680 times. The 1st letter is
 * "a".
 *
 *
 * Constraints:
 *
 * 2 <= s.length <= 100 s consists of lowercase English letters and digits 2
 * through 9. s starts with a letter. 1 <= k <= 109 It is guaranteed that k is
 * less than or equal to the length of the decoded string. The decoded string is
 * guaranteed to have less than 263 letters.
 * 
 * 300000000
 * 29393280
 */
public class DecodeString {

    public static void main(String[] args) {
        DecodeString decodeStr = new DecodeString();
        System.out.println(decodeStr.decodeAtIndex2("ha22", 1));
    }

    public String decodeAtIndex(String s, int k) {
        String sb=new String();
        List<Character> charList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Sb Size: "+sb.length());
            Character c = s.charAt(i);
            if (Character.isLetter(c)) {
                charList.add(s.charAt(i));
            } else {
                for (int j = 0; j < charList.size(); j++) {
                    sb=sb+charList.get(j);

                }
                charList.clear();
                int nos = Integer.parseInt(String.valueOf(c));
                String data = sb.toString();
                for (int v = 0; v < nos - 1; v++) {
                    sb=sb+data;
                }
            }

        }
        return sb.substring(k-1, k);
    }
    
    
    public String decodeAtIndex2(String inputString, int k) {
        long decodedLength = 0; // Total length of the decoded string

        for (char character : inputString.toCharArray()) {
            if (Character.isDigit(character)) {
                // If the character is a digit, update the decoded length accordingly                               
                decodedLength *= (character - '0');
                System.out.println("First digit Appeared: "+decodedLength);
            } else {
                // If the character is a letter, increment the decoded length
                decodedLength++;
            }
        }
        System.out.println(decodedLength);
        // Traverse the input string in reverse to decode and find the kth character
        for (int i = inputString.length() - 1; i >= 0; i--) {
            char currentChar = inputString.charAt(i);
            System.out.println("CurrentChar: "+currentChar);
            if (Character.isDigit(currentChar)) {
                // If the character is a digit, adjust the length and k accordingly
                decodedLength /= (currentChar - '0');
                System.out.println("DecodedLength: "+decodedLength);
                k %= decodedLength;
                System.out.println("K: "+k);
                System.out.println("currentChar: "+(currentChar-'0'));
            } else {
                System.out.println("At what condition here k comes: "+k +" decodedlength: "+ decodedLength +" CurrentChar: "+ currentChar);
                // If the character is a letter, check if it's the kth character
                if (k == 0 || decodedLength == k) {
                    return String.valueOf(currentChar); // Return the kth character as a string
                }
                decodedLength--;
            }
        }

        return ""; // Return an empty string if no character is found
    }

}
