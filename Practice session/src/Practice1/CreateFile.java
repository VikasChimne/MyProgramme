//File Handling
//file handling defines how we can read & write data on a file.java IO package contains all the classes throught which we can perform all input & output opertion in the file 
//All the classes devided into two stream--1)byte2)character
package Practice1;
import java.io.File;//importing the file class
import java.io.IOException;

import javax.annotation.processing.Filer;

class CreateFile 
 {
   public static void main(String[] args) 
   {
	File f=new File("C:\\Users\\user\\Desktop\\Newfolder123");	

 try{
	if(f.createNewFile())//specify the name
    {
	  System.out.println("File Successfuly Create");
    }
 else
    { 
	  System.out.println("File Already Exit");
    }
 }
catch(IOException i)
 {  
	System.out.println("Exception Handled");
 }
   
}
}
