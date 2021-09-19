
public class JavaNestedIfExample {

	public static void main(String[] args) {
		
		int age =25;
		int weight =48;
		
		if(age>=18)
		if(weight>50)
		{
			System.out.println("You are eligible to donate blood");
		}
		else
		{
			System.out.println("You are not eligible to donate blood");
		}
		else 
		{
			System.out.println("Age must be greater than 18");
		}
	}
}
//The nested if statement represents the if block within another if block.here the inner if block condition  only when outer if block condition is True 