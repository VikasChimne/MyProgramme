package Practice1;//overidding
class yz extends Test2
{
	  void show()
	  {
		  System.out.println("2");
	  }
	  
		  public static void main(String[] args)
		  {
			  Test2 t=new Test2();
			  t.show();
			  yz r=new yz();
			  r.show();
		  }
}