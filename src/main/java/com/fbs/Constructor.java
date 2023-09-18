/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fbs;

/**
 *
 * @author thiyagaraja
 */
public class Constructor {
    static String str;
public void Constructor ()
{ 
System.out.println("In constructor");
str = "Hello World";
}
public static void main(String [] args)
{
Constructor c = new Constructor();
System.out.println(str);
 
}
    
}
