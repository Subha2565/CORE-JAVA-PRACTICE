/*
Program: Eligibility of 
@author: Subhadip Das
@Date: 9th sep 2022
*/
//decalraing a class
class EligibileDemo
{
	//calling main
	public static void main(String[] args)
	{
		float totalMarks=Float.parseFloat(args[0]); //taking input and parsing
		float pcmMarks=Float.parseFloat(args[1]); //taking input and parsing
		// Nested if
		if(totalMarks>60)
		{
			if((totalMarks>=80)||(pcmMarks>=85))
			{
				System.out.println("You are elegible to take admission in B.tech"); // printing
			}
			// end of inner
			
             else
				{
					System.out.println("You are  elegible to take admission (Except B.tech)"); //printing
				}
				// end of inner else
		}
	     // end of outer if
				
		else 
		{
			System.out.println("You are not elegible to take admission in B.tech"); //printing
		}
		// outer else
				
	}
	//end of main
}
// end of class  IfElseDemo2