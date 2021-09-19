package Practice1;
import java.util.Scanner;

class PersonalInformation
{
        public static void main(String[] args) 
     {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=s.next();
		System.out.println("Enter your Age:");
		int age=s.nextInt();
		System.out.println("Enter your Gender:");
		char gender=s.next().charAt(0);
		System.out.println("Enter your number:");
		long phno=s.nextLong();
		System.out.println(".........................");
		System.out.println("Name:"+name);
		System.out.println("Age::"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Phone No.:"+phno);
     
	 }
}
