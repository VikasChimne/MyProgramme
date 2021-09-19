package assignment2;

public class FibonacciExample1{  
		public static void main(String args[])  
		{    
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);    //0 1
		    
		 for(i=2;i<count;++i)   
		 {    
			
		  n3=n1+n2;    // 0+1=1 // 1+1=2 // 1+2=3 //3+2=5 //3+5=8 //8+5=13// 8+13=21//13+21=34
		  System.out.print(" "+n3);   // 1  2  3 5 8 13 21 34
		  n1=n2;    //n1=0 1 1 2 3 5 8  13 21
		  n2=n3;    //n2=1 1 2 3 5 8 13 21 34
		 }    
		  
		}}

//0  1  1  2  3  5  8
//n1 n2
//   n1 n2
//		n1 n2