/*
Program: Eligibility of 
@author: Subhadip Das
@Date: 12th sep 2022
*/
//decalraing a class
class MarksGrade
{
	//calling main
	public static void main(String[] args)
	{
		float totalMarks=Float.parseFloat(args[0]); //taking input and parsing
		// Nested if
		if(totalMarks>=80)
		{
			System.out.println("Grade is  A");// printing
		}
			else if((totalMarks<80)&&(totalMarks>=60))
			{
				System.out.println("your Grade is  B");// printing
			}
				else if((totalMarks>=50)&&(totalMarks<60))
				{
					System.out.println("your Grade is  c");
				}
					else if((totalMarks>45)&&(totalMarks<=50))
					{
						System.out.println("your Grade is  D");
					}
						else if((totalMarks>=25)&&(totalMarks<=45))
						{
							System.out.println("your Grade is  E");
						}
						else //Danling else
						{
							System.out.println("your Grade is  F");
						}
			
	} // end of main
}	
			
// end of class  MarksGrade