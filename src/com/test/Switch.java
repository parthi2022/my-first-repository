package com.test;

public class Switch {

	 public static void main(String[] args) {
	        
	        //int a=5;
	        char ch='c';
	        String st="x";
	        
	        switch(st)
	        {
	        case "a","x","y":System.out.println("Welcome to Java"); //multiple values per case
	              break;
	              
	        case "b":System.out.println("Welcome to Python");
	              break;
	          
	        case "c":System.out.println("Welcome to C++");
	              break;
	          
	        case "d":System.out.println("Welcome to Java");
	              break;
	              
	         default:System.out.println("Wrong input!!");                 
	        }

	    }

	
}


