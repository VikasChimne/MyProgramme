package Practice1;//Abstraction

class Car extends Vehicle1
{
  void start()
     {
         System.out.println("Car starts with key");
      }
}
//Abstraction is hiding internal implementation(Detail) & just highlighting the setup services that we are offering
//A method without body is-abstract method
//A method must always be declared in an abstract class
//If a regular class extends an abstract class then the class must have to implement all the abstract methods of abstract parent class or it has to be declared abstract as well
//Abstract method in an abstract class are meant to be overridden in derived concrete classes otherwise compile time error will be thrown
//no need to create any object of abstract class but create reference


