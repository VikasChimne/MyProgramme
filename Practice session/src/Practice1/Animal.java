//OOP's concept
//Object Oriented Programming structure/system
//6 main pillars of OOP's are--1)Class2)Inheritance3)Abstraction4)Object/Method5)Polimorphism6)Encapsulation
//CLASS--Is the Collection of Objects/is not real world entity/does not occupy memory
//METHOD--A set of codes which perform particular task
//Advantage of method--1)Code reusability 2)Code Optimization
//OBJECT--1)It is an instance of class 2)Object is Real world entity 3)it occupy memory
//OBJECT consist of,1)Identity-Name;2)State/Attribute-color,breed,age;3)Behavior-eat,run
//Create an Object Steps--1)Declaration2)Instantiation 3)Initialization

package Practice1;
//class Animal 
//{
//      public void eat()//method
//   {
//	System.out.println("I am eating");
//   }
// public static void main(String args[])
//   {
//	 System.out.println("1");//Declaration--Animal-buzo
//   
//   Animal buzo=new Animal();//Initialization--buzo=new Animal();
//   buzo.eat();buzo.run();//Instantiation--buzo=new
//   }
// public void run()
// {
//	 System.out.println("I am Running");
// }
// 
//}

//To Initialize OBJECT--1)By using reference variable

//class Animal
//{
//	String color;
//	int age;
//
//	public static void main(String args[])
//	{
//		Animal buzo=new Animal();
//	    buzo.color="Black";
//	    buzo.age=10;
//	System.out.println(buzo.color+" , "+buzo.age);
//	}
//}

//Initialize OBJECT through Method
//  class Animal
//  {
//	  String color;//variable
//	  int age;//variable
//	  void initObj(String c,int a)//method
//	  {
//		  color=c;
//		  age=a;
//	  }
//	  void display()//method
//	  {
//		  System.out.println(color+" "+age);
//	  }
//	  public static void main(String args[])
//	  {
//		  Animal buzo=new Animal();//object
//		  buzo.initObj("black",10);
//		  buzo.display();
//	  }
//  }

//By Using Constructor--used to initialize an object not to create object
//Constructor is a special type of method whose name is same as class name
//does not have any return type not even void
//The only modifier applicable for constructor are Public,Protected,Default,& Private
//It executes automatically when we create an object
//THREE Types of Constructor-1)Default2)Non arg Constructor(User defined)3)Parameterized
//class Test
// {
//	 public Test()
//	 {
//		 
//	 }
//	 public static void main(String args[])
//	 {
//		 Test t=new Test();//Constructor
//	 }
// }

//Default Constructor
//class Test
//{
//	Test()
//	{
//		super();
//	}
//	public static void main(String args[])
//	{
//		Test t=new Test();
//	}
//}

//Non arg Constructor(User Defined)
//class Test
//{
//	Test()
//	{
//		
//	}
//	public static void main(String args[])
//	{
//		Test t=new Test();
//	}
//}

//Parameterized Constructor
//class Test
//{
//	Test(String Name)
//	{
//	
//	}
//public static void main(String args[])
//{
//	Test t=new Test("vikas");
//}
//}
















