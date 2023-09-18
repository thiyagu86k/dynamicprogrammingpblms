/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class TreeN {
   
    
    public BinaryTreeInvert mirrorTree(BinaryTreeInvert rootNode){
        if(rootNode==null){
            return null;
        }
        BinaryTreeInvert left=mirrorTree(rootNode.left);
        BinaryTreeInvert right=mirrorTree(rootNode.right);
        
        rootNode.left=right;
        rootNode.right=left;
        return rootNode;
    }
     public void printTree(BinaryTreeInvert root) {
        if (root == null) {
            return;
        }

        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
    
    public static void main(String[] args) {
        BinaryTreeInvert rootNode=new BinaryTreeInvert(2);
        BinaryTreeInvert leftNode=new BinaryTreeInvert(1);
        BinaryTreeInvert rightNode=new BinaryTreeInvert(3);
        rootNode.left=leftNode;
        rootNode.right=rightNode;
        TreeN tree=new TreeN();
        tree.printTree(rootNode);
        System.out.println("Mirror Nodes");
        tree.printTree(tree.mirrorTree(rootNode));
        
        
    }
    
    
    
    
}

class BinaryTreeInvert{
     int val;
    BinaryTreeInvert left;
    BinaryTreeInvert right;
    
    public BinaryTreeInvert(int val){
        this.val=val;
        
    }
}
