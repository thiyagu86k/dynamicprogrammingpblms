    
package com.fbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author thiyagaraja
 */
/**
 * 
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

 

Example 1:

Input: ratings = [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: ratings = [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it satisfies the above two conditions.
 

Constraints:

n == ratings.length
1 <= n <= 2 * 104
0 <= ratings[i] <= 2 * 104
 */
public class CandyProblemLeetCode {
     public static int candy(int[] ratings) {
         int sum=0;
         Map<Integer,List<Integer>> postitionIndex=new HashMap<Integer,List<Integer>>();
         int min=Integer.MAX_VALUE;
         int max=-1;
         for(int i=0;i<ratings.length;i++){
             min=Math.min(min, ratings[i]);
             max=Math.max(max, ratings[i]);
         }
        // System.out.println("min: "+min+"\t Max:"+max);
         for(int i=0;i<ratings.length;i++){
             //System.out.println(ratings[i]);
             if(postitionIndex.containsKey(ratings[i])==false){
                 List<Integer> positionList=new ArrayList<>();
                 positionList.add(i);
                 postitionIndex.put(ratings[i], positionList);
             }else{
                 postitionIndex.get(ratings[i]).add(i);
             }
             if(min==ratings[i]){
                  sum=sum+1;
             }else if(max==ratings[i]){
                 if(postitionIndex.get(ratings[i]).size()>1){
                     List<Integer> positionList=postitionIndex.get(ratings[i]);
                     int index=positionList.get(positionList.size()-1);
                     if(i==index){
                         sum=sum+1;
                     }
                 }else{
                 sum=sum+2;
                 }
             }
             else if(min<ratings[i] && max>ratings[i]){
                if(postitionIndex.get(ratings[i]).size()>1){
                     List<Integer> positionList=postitionIndex.get(ratings[i]);
                     int index=positionList.get(positionList.size()-1);
                     if(i==index){
                         sum=sum+1;
                     }
                 }else{
                 sum=sum+2;
                 }
             }
             else{
                
                 sum=sum+1;
             }
         }
         
        
         return sum;
    }
     
     public static void main(String[] args) {
         int[] ratings={1,2,87,87,87,2,1};/*1,2,2,1,2,2,1*/
         System.out.println(candy(ratings));
         if(0<1 && 2>1){
             System.out.println("true");
         }
        
    }
    
}
