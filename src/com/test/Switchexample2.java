package com.test;

public class Switchexample2 {
		public static void main(String[] args) {
		    
	        int code=4;
	        
	        
	        String result=switch(code) 
	        {
	        case 1-> {yield "Java";}
	        case 2-> {yield "C++";}
	        case 3-> {yield "C";}
	        default->{ yield "python";} 
	    
	        };
	        
	        System.out.println(result);

	    }

	}

