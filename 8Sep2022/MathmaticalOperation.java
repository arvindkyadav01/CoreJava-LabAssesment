/*
Program@ Find Quotient and Remainder 
Auther@Arvind yadav
date@08 sep
*/

//declearing class 
import java.util.Scanner;
class MathmaticalOperation
{
     //Create main method
     public static final void main (String args[])

  {
    Scanner sc=new Scanner(System.in);
    int num1,num2,q,r,d;
    System.out.println("Enter the number");
	num1=sc.nextInt();
    System.out.println("Enter the number which will divide the number to quotient and remainder");
	d=sc.nextInt();
	q=num1/d;
	r=num1%d;
	System.out.println("Quotient of the number is"+q);
	System.out.println("Remainder of the number"+r);
	
  } 
  //end main method
}

//end class