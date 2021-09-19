//'Super' Keyword is also reference variable which is used to refer immediate parent class object
//#uses of "Super"Keyword
//is used to refer immediate parent class instance variable
//used to invoke immediate parent class method
//super() can be used to invoke immediate parent class constructor
public class Super 
 {
  int i=10;	
 }
 class B extends Super
 {
	 int i =20;
	 void show(int i)
   { 
	 System.out.println(super.i);  //output=10
	 System.out.println(this.i);   //output=20
   }
	 public static void main(String[] args)
	 {
		 B ob = new B();
		 ob.show(30);
	 }
 }