package Practice1;

import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args)
	{
	      int no;
	      Scanner s= new Scanner (System.in);
	      System.out.println("enter a number:-");
	      no=s.nextInt();
	      if(no%2==0)
	      {
	        
	        	System.out.println("no is even");
	        }
	        
		else{
	        	System.out.println("no is odd");
	        }

	}
}


