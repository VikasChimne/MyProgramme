//#Uses of "this'keyword
//'this' keyword can be used to refer current class instance variable 
//Used to invoke current class method(Implicitly)
//Used to invoke Current class constructor
//used to pass as an argument in the method call
//used to pass as an argument in the constructor call
//used to return the current class instance from the method

public class test_1 
{
  int i; 
  void setValue(int i)
  
  {
	  this.i=i;  //'this'keyword is the reference variable that refers to the current object
  }
  void show()
  {
	  System.out.println(i);
  }
}
//class p
//{
//	public static void main(String[] args)
//	{
//		test_1 t = new test_1();
//		t.setValue(10);
//		t.show();
//	}
//}
//output=10