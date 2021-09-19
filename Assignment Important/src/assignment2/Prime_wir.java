package assignment2;
class A
{   
    public static void main(String args[])
	{
	    int start=1,end=20,count=0;
	    System.out.println("Prime numbers between "+start+" and "+end+" are : ");
		for(int i = start ; i <= end ; i++)
		{
			
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	}
}
