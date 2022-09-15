/*
Program@ print pattern
     *
    * *
   * * *
  * * * *
Auther@Arvind yadav
Date@15Sep
*/

//Declearing the class
class Christams
{
  public static void main(String[] args) 
  //Starting main method
  {
      for(int i=1; i<=4; i++)
      {
	 for(int k=1; k<=5-i+1; k++)
	 {
	   System.out.print(" ");
	 }
	 for(int j=1; j<=2*i-1; j++)
	 {
	   System.out.print("*");
	 }
	 System.out.println();
      }
	
	
  }
}
//End The class