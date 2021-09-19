package Practice1;

//public class normal
//{
//	private void show()
//	{System.out.println("I am there");
//	
//	}
//	 
//	
//	public static void main(String[] args)
//	{
//		normal r=new normal();
//		r.show();
//		
//	}	
//	
//}
	
class normal  
{
	 protected static void show()	
	 {
		 int a = 10;
		 int b=  20;
		 System.out.println(a+b);
	 }
	 public static void main(String[] args)
		{
	
		normal r = new normal();
		//Disp();
		r.Disp();
		show();
		
		}

      void Disp()
    {
	 System.out.println("Display method"); 
    }
 }