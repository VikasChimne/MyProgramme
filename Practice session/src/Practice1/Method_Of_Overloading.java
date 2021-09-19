package Practice1;

public class Method_Of_Overloading
{
     void show(int a,int b)     //method
    	{System.out.println("1");}
     
     void show(int a)         //method
    	{
    	 System.out.println(2);
    	 }
     
    	public static void main (String[] args) 
    	
    	{  
    		Method_Of_Overloading t=new Method_Of_Overloading();
    	
    		t.show(10);
    	
    		t.show(10,27);
    	}
}
