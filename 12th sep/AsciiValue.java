/*
program : To print the ASCII value of a character
*/
//declaring a class
class AsciiValue
{
	// declaring method printAsciiValue
	//static void printAsciiValue(char cValue)
	//{
		//int asciival = cValue;// computing ASCII VALUE
		//System.out.println("The ascii value of "+ cValue +" is :"+ asciival);
	//} // end of method
	// declaring method checkChar 
	static void checkChar(char cValue)
	{
		int asciiVal= cValue;
		if((asciiVal>=65)&&(asciiVal<=90))
		{
			System.out.println(" it is a capital latter");
			if((cValue=='A')||(cValue=='E')||(cValue=='I')||(cValue=='O')||(cValue=='U'))
			{
				System.out.println("Its a Vowel");
			}
				else
				{
					System.out.println("Its a consonant");
				}
		}
			else if((asciiVal>=97)&&(asciiVal<=122))
			{
				System.out.println(" it is a small latter");
				if((cValue=='a')||(cValue=='e')||(cValue=='i')||(cValue=='o')||(cValue=='u'))
				{
					System.out.println(" Its a Vowel ");
				}
					else
					{
						System.out.println(" Its a consonant ");
					}
			}
			else if((asciiVal>=46)&&(asciiVal<=57))
			{
				System.out.println(" it is a number");
			}
		else
		{
			System.out.println(" it is a special charecter ");
		}
	}// end of method

   public static void main(String args[])
   {
	   char value = args[0].charAt(0);// taking a character input
	   // calling method printAsciiValue
	  // printAsciiValue(value);// passing value as a parameter
	  checkChar(value);
   }	// end of main
}   // end of class