/*
Program : For loop demo : Factorial
5! = 5*4*3*2*1
5!= 1*2*3*4*5
@author: SUBHADIP DAS
@Date: 13TH sept 2022

*/

class Factorial
{
	static void computeFactorial(int num)
	{
	    long result =1L;
		for(int i=num;i>=1;i--)
		{
			result*=i;
			System.out.println(i+ "    "+ result);
		}
		System.out.println("The factorial of the number "+ num +" is: "+ result);
		
	}
	
	static void computeFactorial2(int num)
	{
	    long result =1L;
		for(int i=1;i<=num;i++)
		{
			result*=i;
			System.out.println(i+ "    "+ result);
		}
		System.out.println("The factorial of the number "+ num +" is: "+ result);
		
	}
	
	
	
	
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
       computeFactorial(number);  
   }


}















