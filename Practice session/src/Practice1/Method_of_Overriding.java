package Practice1;

public class Method_of_Overriding 
{    
	public static void main(String args[])
   {
	 Method_of_Overriding t=new Method_of_Overriding();
	                     t.show();
	  
	Xyz x=new Xyz();
	    x.show();
   }
      void show()//method
    	  {
    	    System.out.println("1");
    	   }
 }
     
         class Xyz extends Method_of_Overriding
      {
    	  void show()//method
    	  {
    		  System.out.println("2");
    	  }
      }
         
         

