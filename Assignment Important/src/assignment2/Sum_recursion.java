package assignment2;

	import java.util.*;
	import java.lang.*;

	class sum_recursion
	{   
	    public static void main(String args[])
		{
			int n = 21;
			System.out.println(recurSum(n));
		}
		
		public static int recurSum(int n)
		{
			if (n <= 1)
				return n;
			return n + recurSum(n - 1);
		}
	}



