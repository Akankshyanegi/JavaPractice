package com.example.shape.assignment;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter a shape name as your input: "); 
        String input = sc.next(); 
        
        if (input.equals("circle")){
        	
        	System.out.println("This is a circle");
        	System.out.println("Playing music file");
        	
        }else if (input.equals("triangle")){
        	
        	System.out.println("This is a triangle");
        	System.out.println("Playing music file");
        	
        }else if (input.equals("rectangle")){
        	
        System.out.println("This is a rectangle");
    	System.out.println("Playing music file");}
         
	}
}


