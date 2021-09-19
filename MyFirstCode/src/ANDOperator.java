
public class ANDOperator {
     
	public static void main(String[] args){
		
		 int a = 10;
		 int b = 5;
		 int c = 20;
		 
//	System.out.println(a<b && a++c);//false&&true=false
	System.out.println(a);         //10,Because second condition is not checked 
	System.out.println(a<b & a++<c);//false && true=false
	System.out.println(a);         //11 because second condition is checked
}
}
//In Logical AND(&&) operator doesn't check second condition if first condition is false.
//it check second condition only if first condition is true
//The bitwise AND(&) operator always check both conditions whether first condition is true or false 