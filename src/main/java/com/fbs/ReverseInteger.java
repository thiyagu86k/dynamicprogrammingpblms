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
 * Given a signed 32-bit integer x, return x with its digits reversed. If
 * reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or
 * unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123 Output: 321 Example 2:
 *
 * Input: x = -123 Output: -321 Example 3:
 *
 * Input: x = 120 Output: 21
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(1563847412));
        // System.out.println(reverse(321));
    }

    public static int reverse(int x) {
        boolean negativeFlag = false;
        if (x < 0) {
            x = x * -1;
            negativeFlag = true;
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        if (x < max) {

        } else {
            return 0;
        }
        int y = 0;
        int reverseInt = 0;
        int powerpfnumber = 0;
        int length = 0;
        long temp = 1;
        while (temp <= x) {
            length++;
            temp *= 10;
        }
        for (int i = 0; i < length; i++) {
            y = x % 10;
            x = x / 10;
            int tens = (length - i) - 1;
            powerpfnumber = (int) (Math.pow(10.0d, (double) tens));

            if (((long) y * powerpfnumber) > max) {
                return 0;
            }
            if (((long) reverseInt + ((long) y * powerpfnumber)) > max) {
                return 0;
            }
            reverseInt = reverseInt + (y * powerpfnumber);

        }
        if (negativeFlag) {
            reverseInt = reverseInt * -1;
        }

        if (min > reverseInt && reverseInt < max) {
            return reverseInt;
        }
        return 0;

    }

}
