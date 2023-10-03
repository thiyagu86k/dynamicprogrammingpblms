/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.windowsliding;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author thiyagaraja
 */
public class LongestSubString {
    public static final int CHAR_RANGE = 128;
 
    // Function to find the longest substring of a given string containing
    // `k` distinct characters using a sliding window
    // abcbdbdbbdcdabd
    public static String findLongestSubstring(String str, int k)
    {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }
 
        // stores the longest substring boundaries
        int end = 0, begin = 0;
 
        // set to store distinct characters in a window
        Set<Character> window = new HashSet<>();
 
        // Count array `freq` stores the frequency of characters present in the
        // current window. We can also use a map instead of a count array.
        int[] freq = new int[CHAR_RANGE];
 
        // `[low…high]` maintains the sliding window boundaries
        long loopCout=0;
        for (int low = 0, high = 0; high < str.length(); high++)
        {
            loopCout++;
            System.out.println("loopCount: "+loopCout);
            System.out.println(str.charAt(high));
            window.add(str.charAt(high));
            freq[str.charAt(high)]++;
            System.out.println("low: "+low +" high: "+high);
            // if the window size is more than `k`, remove characters from the left
            while (window.size() > k)
            {
                System.out.println("Executing while loop");
                // If the leftmost character's frequency becomes 0 after
                // removing it in the window, remove it from the set as well
                if (--freq[str.charAt(low)] == 0) {
                    window.remove(str.charAt(low));
                    System.out.println("Low when to remove: "+low);
                }
 
                low++;        // reduce window size
            }
 
            // update the maximum window size if necessary
            if (end - begin < high - low)
            {
                end = high;
                begin = low;
            }
        }
 
        // return the longest substring found at `str[begin…end]`
        return str.substring(begin, end + 1);
    }
 
    public static void main(String[] args)
    {
        String str = "abcbdbdbbdcdabd";
        int k = 2;
 
        System.out.print(findLongestSubstring(str, k));
    }
    
}
