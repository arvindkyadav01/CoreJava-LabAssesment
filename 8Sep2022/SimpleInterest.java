/*
Program@ Find The Simple Intrest
Auther@Arvind yadav
date@08 sep
*/

import java.util.Scanner;

//Declearing the clas 
public class SimpleInterest
{
   public static void main(String args[]) 
   {
	   int p,t=5,r,si;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter Principal Amount:-");
	   p=sc.nextInt();
	   System.out.print("Enter the Rate Of Interest On Principal:-");
	   r=sc.nextInt();
	   si=(p*r*t)/100;  //Simple intrest formula 
	   System.out.println("Interest for 5 year is "+si);
	}
	//End main method   
}	
    //End Class 