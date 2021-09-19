package Practice1;

public class Test1Overloading

//{
//	void show(int a,int b)
//	{
//		System.out.println("1");//2
//	}
//	void show(int a)
//	{
//		System.out.println("2");//1
//	}
//	public static void main(String[] args)
//	{
//		Test1Overloading t=new Test1Overloading();
//		t.show(10);
//		t.show(10,20);
//	}
//}

{
	void show(int a)
	{
		System.out.println("abc");
	}
	void show(String b)
	{
		System.out.println("cde");
	}
	public static void main(String args[])
	{
		Test1Overloading t=new Test1Overloading();
		
		t.show(2);
		t.show("Vikas");
	}
}
//{
//	void show(Object a)
//	{
//		System.out.println("object method");
//	}
//	void show(String a)
//	{
//		System.out.println("String method");
//	}
//	public static void main(String args[])
//	{
//		Test1Overloading t=new Test1Overloading();
//		t.show("abc");
//	}
//	
//}