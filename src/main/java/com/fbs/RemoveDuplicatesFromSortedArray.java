/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author thiyagaraja
 */
public class RemoveDuplicatesFromSortedArray {
    
    public static void main(String[] args) {
        int[] input=new int[]{0,0,1,1,1,2,2,3,3,4};
        int removedDupli=removeDuplicates(input);
        System.out.println("After remove Duplicates: "+removedDupli);
    }
    
    public static int removeDuplicates(int[] nums){
        Set<Integer> hashSet=new HashSet();
        int j=0;
        for(int i:nums){
            if(!hashSet.contains(i)){
            hashSet.add(i);
            nums[j]=i;
            j++;
            
            }
            
        }
        
        return j;
    }
    
}
