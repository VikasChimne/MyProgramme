
import java.io.*;
public class calculator
{
   public static void main(String[] args) throws IOException {
    int n1,n2,n3,ch;
    BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));        
         System.out.println("Enter your choice:");
         System.out.println("1:-addition");
         System.out.println("2:-subsraction");
         System.out.println("3:-multiplication");
         System.out.println("4:-division");
         ch=Integer.parseInt(dis.readLine());
         switch(ch)
         {
             case 1:System.out.println("Enter 1st number:- ");
                    n1=Integer.parseInt(dis.readLine());
                    System.out.println("Enter 2nd number:- ");
                    n2=Integer.parseInt(dis.readLine());
                    n3=n1+n2;
                    System.out.println(n1 + " + " + n2 + " = " + n3);
                    break;
             case 2:System.out.println("Enter 1st number:- ");
                    n1=Integer.parseInt(dis.readLine());
                    System.out.println("Enter 2nd number:- ");
                    n2=Integer.parseInt(dis.readLine());
                    n3=n1-n2;
                    System.out.println(n1 + " - " + n2 + " = " + n3);
                    break;
             case 3:System.out.println("Enter 1st number:- ");
                    n1=Integer.parseInt(dis.readLine());
                    System.out.println("Enter 2nd number:- ");
                    n2=Integer.parseInt(dis.readLine());
                    n3=n1*n2;
                    System.out.println(n1 + " * " + n2 + " = " + n3);
                    break;
             case 4:System.out.println("Enter 1st number:- ");
                    n1=Integer.parseInt(dis.readLine());
                    System.out.println("Enter 2nd number:- ");
                    n2=Integer.parseInt(dis.readLine());
                    n3=n1/n2;
                    System.out.println(n1 + " / " + n2 + " = " + n3);
                    break;
             default:
                System.out.print("invalid");
                break;
                
         }
}}
