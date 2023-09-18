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
public class PascalsTriangle {
    public static void main(String[] args) {
        final List<List<Integer>> pascalsTrianlge = generate(5);
        pascalsTrianlge.forEach(row -> {
        row.forEach(num -> System.out.printf("%d ", num));
            System.out.println();
        });
    }
    
    private static List<List<Integer>> generate(final int numRows){
        final List<List<Integer>> result=new ArrayList<>();
        result.add(List.of(1));
        if(numRows==1) return result;
        for(int i=1;i< numRows;i++){
            final List<Integer> tmp=new ArrayList<>(result.get(i-1));
            tmp.add(0);
            tmp.add(0,0);
            final List<Integer> row=new ArrayList<>();
            for(int j=0;j<=result.get(i-1).size();j++){
                row.add(tmp.get(j)+tmp.get(j+1));
            }
            
            result.add(row);
        }
        return result;
    }
    
}
