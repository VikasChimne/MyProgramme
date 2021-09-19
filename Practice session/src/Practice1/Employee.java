
package Practice1;//Encapsulation:in java is a mechanism of wrapping the data(variable)& 
                 //code acting on the data(method)together as a single unit

//#Steps to achieve encapsulation
//1)Declare the variable of a class as private
//2)provide public setter & getter method to modify & view the variables value

public class Employee 
{
	private int empid;//data hiding
	public void setEmpid(int eid)
	{
		empid=eid;
	}
	public int getEmpid()
	{
		return empid;
	}
}
    