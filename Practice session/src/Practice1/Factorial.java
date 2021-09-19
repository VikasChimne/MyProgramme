package Practice1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int no,i,fact=1;
		System.out.println("Enter a no.");
		no=s.nextInt();
		for (i=no;i>=1;i--)
				{
				fact=fact*i;
				}
		System.out.println("Factorial is:-"+fact);

	}

}
