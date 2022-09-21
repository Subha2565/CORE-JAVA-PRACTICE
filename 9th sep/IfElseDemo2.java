/*
Program: IF ELSE DEMO2
@author: Subhadip Das
@Date: 9th sep 2022
*/
//decalraing a class
class IfElseDemo2
{
	//calling main
	public static void main(String[] args)
	{
		int number1=Integer.parseInt(args[0]); //taking input and parsing
		int number2=Integer.parseInt(args[1]); //taking input and parsing
		int number3=Integer.parseInt(args[2]); //taking input and parsing
		// comparing the 3 numbers
		if((number1 == number2) && (number1== number3))
			{
				System.out.println("ALL THE NUMBERS ARE EQUAL"); // printing
			}
			else if((number1>number2)&&(number1>number3))
				{
					System.out.println("number "+number1+" is greatest"); //printing
				}
				else if(number2>number3)
					{
						System.out.println("number "+number2+" is greatest"); //printing
					}
		else // dangling else
		{
		    System.out.println("number "+number3+" is greatest"); //printing
		}
	}
	//end of main
}
// end of class  IfElseDemo2