package com.finra;

public class testAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		int upperLimit = 10;
		printNumber(upperLimit);

	}
	
	 public static void printNumber(int value) {

	     System.out.println("Value is " + value);

	     for(int i = 0; i <= value; i++) {
	    	 //System.out.println("i : " + i);
	    	 
	            if((i%3) == 0) {
	                 System.out.println("FIN ");
	             } else {
	            	 System.out.println(i);
	             }
	            
	            if(i%5 == 0) {
	                 System.out.println("Printing RA instead of the number " + i);
	             } else {
	            	 System.out.println(i);
	             }
	             
	             if( ((i%3) == 0)  && ((i%5) == 0)  ) {
	                 System.out.println("Printing FIN instead of the number " + i);
	             } else {
	            	 System.out.println(i);
	             }
	            
	     }
	 }

}
