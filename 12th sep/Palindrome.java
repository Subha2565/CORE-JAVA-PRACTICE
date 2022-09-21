class Palindrome
{
	static void checkPalindrome(int number)
	{
		int remainder=0;
		int reversedNumber=0;
		int tem=number;
		while(number>0)
		{	
			remainder=number%10;
		    reversedNumber=(reversedNumber*10)+remainder;
			number=number/10;
		}
		if(temp==reversedNumber)
		{
		    System.out.println("The number is a palindrome");
		}
		else
			System.out.println("The number is a palindrome");
	}
	public static void main(String[] args)
	{
	  int number=Integer.parseInt(args[0]);
	  checkPalindrome();
	}
}