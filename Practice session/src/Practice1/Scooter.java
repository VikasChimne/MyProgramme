package Practice1;//Abstraction

class Scooter extends Vehicle1
{
	 void start()
	 {
		 System.out.println("Scooter starts with kick");
	 }

public static void main(String[] args)
{
	 Car c=new Car();
    c.start();
   Scooter s=new Scooter();
   s.start();
}
}