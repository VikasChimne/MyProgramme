package Practice1;

class Test implements I1,I2//Interface
		{
			public void show()
			{
				System.out.println("1");
			}
			public void display()
			{
				System.out.println("2");
			}
			public static void main(String[] args)
			{
				Test t=new Test();
				t.show();
				t.display();
			}
	}


//Interface
//There are no method body,thats why we can't create any object
//this are blueprint of the class.it specify what a class must do & not how
//Uses-1)used to achieve abstractor 2)it supports multiple inheritance 3)used to achieve loose coupling
//Interface methods are by default public& abstract
//interface variables are by default public static+final
//interface method must be overridden inside the implementing classes
//Interface nothing but deals between client & developer