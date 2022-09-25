/*
Program : creating class Bank to create BankDetailss
@author: SUBHADIP DAS
@Date: 23 sept 2022

*/

//declaring class Bank

class AccountCreation
{
	
	//main method
	public static void main(String ...args)
	{
		BankDetails b[] = new BankDetails[5];
		
		b[0] = new BankDetails(101,"joy",500);
		b[1] = new BankDetails(102,"JOHN",150);
		b[2] = new BankDetails(103,"SUDIP",5800);
		b[3] = new BankDetails(104,"ARPAN",58064);
		b[4] = new BankDetails(105,"SUBHA",125874);
		
		for(int i=0;i<5;i++)
		{
			if((b[i].getBalance())<=1000)
			{
				System.out.println("Name :"+b[i].getCoustomerName());
			}
		}
		
		
		
	}
		
		
	
	
}