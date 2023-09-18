/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author thiyagaraja
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] input=new int[]{1,1,2};
        int removedDupli=removeDuplicates(input);
        System.out.println("After remove Duplicates: "+removedDupli);
    }
    
    public static int removeDuplicates(int[] nums){
        Set treeSet=new TreeSet();
        for(int i:nums){
            treeSet.add(i);
        }
        return treeSet.size();
        
    }
    
}
