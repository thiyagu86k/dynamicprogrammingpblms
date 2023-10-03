/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.twopointer;

/**
 *
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the
 * squares of its digits. Repeat the process until the number equals 1 (where it
 * will stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy. Return true if n is a
 * happy number, and false if not.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 19 Output: true Explanation: 12 + 92 = 82 82 + 22 = 68 62 + 82 =
 * 100 12 + 02 + 02 = 1 Example 2:` ````````~````~~  *
 * Input: n = 2 Output: false
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(1));
        //   System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {

        return happyCheck(n);

    }

    public static boolean happyCheck(int n) {

        int sum = 0;
        while (sum != 1) {
            sum = 0;
            while (n > 0) {
                int k = n % 10;
                k = k * k;
                n = n / 10;
                sum = sum + k;
            }
            if (sum == 4) {
                return false;
            }
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }

        }

        return false;
    }

    public static int findSizeofInt(int n) {
        if (n >= 1000 && n < 10000) {
            return 4;
        } else if (n >= 100 && n < 1000) {
            return 3;
        } else if (n >= 10 && n < 100) {
            return 2;
        } else if (n >= 0 && n < 10) {
            return 1;
        } else {
            String s = n + "";
            return s.length();
        }

    }

}
