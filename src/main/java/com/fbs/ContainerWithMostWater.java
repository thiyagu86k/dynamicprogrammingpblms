/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.net.URI;
import java.net.http.HttpRequest;

/**
 *
 * @author thiyagaraja
 */
/**
 * 
 * Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the 
 * two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
* Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,1};
        System.out.println(maxArea(height));
        try{
        HttpRequest request=HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET().build();
            System.out.println(request.bodyPublisher().toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int width=right - left;
            int h=Math.min(height[left],height[right]);
            int area=width*h;
            System.out.println("area calc:"+area);
             maxArea=Math.max(maxArea, area);
             if(height[left]< height[right]){
                 left++;
             }else if(height[left]>height[right]){
                 right--;
             }else{
                 left++;
                 right--;
             }
            
            
        }        
        return maxArea;
        
    }
    
}
