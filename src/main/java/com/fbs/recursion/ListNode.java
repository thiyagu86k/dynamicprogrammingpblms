/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs.recursion;

/**
 *
 * @author thiyagaraja
 */
public class ListNode {

    Node head;
    

    

    ListNode() {
        this.head=null;
       
       // if(this.head==null){
       //     head=new ListNode(val);
       // }
       // this.next=null;
    }

   
    
    public void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node currentNode=head;
            while(currentNode.next!=null){
                    currentNode=currentNode.next;
            }
            currentNode.next=newnode;
        }
    }

    public void print(ListNode listNode){
        ListNode currNode=listNode.head;
        while(currNode!=null){
           
            currNode=currNode.next;
            if(currNode!=null)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                 System.out.println("Data Node: "+currNode.val);
            
        }
    }
   
    
}