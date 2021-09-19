package assignment2;

public class CountingDigit {

	public static void main(String[] args) {
		int count = 0, num = 12405;

	    while (num != 0) {
	 
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	
		

	}


