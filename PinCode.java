package com.decisionsloop.bll;

import java.util.Scanner;

public class PinCode {
	
	public static void main(String[] args) {
		 
		int code = 0000;
		 
		
		 
	Scanner scanner = new Scanner(System.in);
	{
		int count = 1;
		while(count>=3) {
			int code11 = scanner.nextInt();
			count++;
	    if (code11==code) {
	        System.out.println("Correct, welcome back."); 
	       break;}
	    
	    else { 
	        System.out.println("Incorrect, try again.");
	    }
	    
	if(code11 >= 3) {
	     System.out.println("Sorry but you have been locked out");
	
	}

	}
		
		scanner.close();}
	}					
	}
	
	
	


	
