
public class ORoperator {

	public static void main(String[] args) {
		
		 int a = 10;
		 int b = 5;
		 int c = 20;
		 
		 System.out.println(a>b||a<c);//true||true=true
		 System.out.println(a>b|a<c);//true|true=true
		 System.out.println(a>b||a++<c);//true||true=true
		 System.out.println(a);        //10 because second condition is not checked
		 System.out.println(a>b|a++<c);//true|true=true
		 System.out.println(a);//11 because second condition is checked
	}

}

//In Logical OR(||) operator doesn't check second condition if first condition is true.
//it check second condition only if first condition is false
//The bitwise OR(|) operator always check both conditions whether first condition is true or false