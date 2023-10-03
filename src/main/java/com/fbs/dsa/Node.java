/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.dsa;

/**
 *
 * @author thiyagaraja
 */
public class Node {
    
    int value;
    Node leftNode;
    Node rightNode;
    Node root;
    
    
    public Node(int val){
        this.value=val;
        leftNode=null;
        rightNode=null;
        
    }
    
    public void insert(int value){
        root=insertRecursive(root,value);
    }
    Node insertRecursive(Node current, int value){
        if(current==null){
            return new Node(value);
        }
        if(value<current.value){
            current.leftNode=insertRecursive(current.leftNode, value);
        }else if(value> current.value){
            current.rightNode=insertRecursive(current.rightNode, value);
        }else{
            return current;
        }
        return current;
    }
    public static void main(String[] args) {
        Node binaryNode=new Node(0);
        int[] nodelist=new int[]{10,20,30,40,50,60,70,80,90,100};
        for(int i:nodelist){
            binaryNode.insertRecursive(new Node(i), i);
        }
      
    }
}