package Practice1;
import java.util.Scanner;
public class PrintTable {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a;
		
		System.out.println("Enter no.to print Multiplication table");
		
		a=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(" " +a+ " * " +i+ " = "+a*i);//5*1=5
		}
		

	}

}
