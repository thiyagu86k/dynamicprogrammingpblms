/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiyagaraja
 */
public class PalindromPartitionGPTSolved {
    static public List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    palindromePartitioningHelper(s, 0, new ArrayList<>(), result);
    return result;
  }

  static private void palindromePartitioningHelper(String s, int start, List<String> currList, List<List<String>> result) {
    if (start == s.length()) {
      result.add(new ArrayList<>(currList));
      return;
    }

    for (int i = start; i < s.length(); i++) {
        System.out.println("start: "+start +" i: "+i);
      if (isPalindrome(s, start, i)) {
          System.out.println(s.substring(start, i+1));
        currList.add(s.substring(start, i + 1));
        palindromePartitioningHelper(s, i + 1, currList, result);
          System.out.println("test after the recursive call");
        currList.remove(currList.size() - 1);
      }
    }
  }

  static private boolean isPalindrome(String s, int low, int high) {
    while (low < high) {
      if (s.charAt(low++) != s.charAt(high--)) {
        return false; 
      }
    }
    return true;
  }
    public static void main(String[] args) {
        String s="aab";
        System.out.println(partition(s));
    }
    
}
