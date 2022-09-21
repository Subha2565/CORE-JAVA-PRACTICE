/*
Program: SWITCH CASE 2
@author: Subhadip Das
@Date: 12th sep 2022
*/
//decalraing a class
class SwitchDemo2
{
	//calling main
	public static void main(String[] args)
	{
		char grade=args[0].toUpperCase().charAt(0);// (we take char from user)args is a string when it enter at that time toupper use to for capital case.
		switch(grade)
		{
			case 'A': System.out.println("Pass:Excellent");
					break;
			case 'B': System.out.println("Pass:Very good");
					break;
			case 'C': System.out.println("Pass: Good");
					break;
			case 'D': System.out.println("Pass:Can do better ");
					break;
			case 'F': System.out.println("Friday");
					break;
			default : System.out.println("Wrong Input");
		}
	}	
	//end of main
}
// end of class SwitchDemo2