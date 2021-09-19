package Practice1;
import java.io.File;//create new file//file handling is done with the help of the file class of the java.io package
//import java.io.filewriter;
public class Test3 
{
public static void main(String[] args)
{
	File myfile=new File("Test_file1.text");
	try
	{
		myfile.createNewFile();
		System.out.println("file created successfully");
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
}
}
//file handling defines how we can read & write data on a file.Java IO package contains all the classes
//through which we can perform all input & output operation in the file