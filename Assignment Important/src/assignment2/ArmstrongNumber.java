package assignment2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner (System.in);
	System.out.println("enter number");
		
		int c=0,a,temp;
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			a=n%10; //153 = 153%10=3 | 15%10=5 | 1%10=1
			n=n/10; //153/10=15 | 15/10=1 | 1/10=0
			c=c+(a*a*a); //27+0=27 \125+27=152 | 152+1=153
		}
		if(temp==c)
		System.out.println(temp +" is a armstrong number");
		else
		System.out.println(temp +" is not armstrong number");
			
		
	
	}
	
}
