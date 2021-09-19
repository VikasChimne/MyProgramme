package Practice1;
//Overriding

//method name is same//method is in different class thats why we use inheritance
//same argument--1)no.of argument2)seq.of argument3)type of argument
//is used to provide the specific implementation of the method that is already provided by its superclass
//its occurs in two classes that have IS-a relation
//parameter must be same//Return type must be same
public class Test2
{
  void show()
  {
	  System.out.println("1");
  }
}
 
//Invoking overridden method from subclass
//-->we can call parent class method in overriding method using super keyword