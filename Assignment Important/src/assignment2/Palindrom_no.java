package assignment2;

    public class Palindrom_no {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=656;
		  
		  temp=n;    
		  while(n>0){   //656 
		   r=n%10;  //656%10=6 | 65%10=5 | 6%10=6
		   sum=(sum*10)+r;    //6 | 6*10=60+5=65 | 65*10=650+6=656
		   n=n/10;    //656/10=65 | 65/10=6 |6/10=0
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

