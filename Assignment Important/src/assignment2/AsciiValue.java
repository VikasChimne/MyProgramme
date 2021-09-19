package assignment2;
import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) 
    {
     Scanner s=new Scanner(System.in);
     String yn;
     do
     {
     System.out.println("Enter a Char");
     
        char input= s.next().charAt(0);
     
        
        int castAscii = (int) input;
      System.out.println("The ASCII value of " + input + " is: " + castAscii);
      System.out.println("Do u want to continu(Press y for Yes and n fo No)");
      yn=s.next();	
			
		}while(yn.equals("y")|| yn.equals("Y"));
     
    }

	    
	}



//a=97
//b=98
//c=99
//