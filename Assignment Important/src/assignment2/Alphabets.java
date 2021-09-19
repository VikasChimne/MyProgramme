package assignment2;

		import java.io.*;
import java.util.Scanner;
	 
	    public class Alphabets {
	 
	    static void charCheck(char input_char)
	    {
	        
	        if ((input_char >= 65 && input_char <= 90)
	            || (input_char >= 97 && input_char <= 122))
	            System.out.println(" Alphabet ");
	 
	        
	        else if (input_char >= 48 && input_char <= 57)
	            System.out.println(" Digit ");
	 
	  
	        else
	            System.out.println(" Special Character ");
	    }

	    public static void main(String[] args)
	    {
			/*
			 * char input_char = '1';
			 * charCheck(input_char);
			 */
			 
			 Scanner sc = new Scanner(System.in);
				
			 
			 System.out.println("enter character below ");
				String str = sc.nextLine();
				
				for(char c :str.toCharArray() ) 
				{
					if (Character.isLetter(c) )
					{
						System.out.println(c +" is Character");
						
					}
					else 
					{
						System.out.println(c +" is not Character");
					}
					
				}
	 
	    }
	}


