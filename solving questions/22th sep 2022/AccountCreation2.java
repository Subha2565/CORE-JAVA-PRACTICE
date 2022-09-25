/*
Program : creating class Bank to create BankDetailss
@author: SUBHADIP DAS
@Date: 23 sept 2022

*/

//declaring class Bank
import java.util.Scanner;

class AccountCreation2
{
	
	//main method
	public static void main(String ...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of students ;");
		int size = sc.nextInt();
		BankDetails b[] = new BankDetails[size]; // creating array
		
		
		//loop for input
		
		for(int i=0;i<size;i++)
		{
			b[i]=new BankDetails(); //allocate the memory
			
			System.out.println("enter id:");
			b[i].setBankId(sc.nextInt());
			
			System.out.println("enter name:");
			b[i].setCoustomerName(sc.next());
			
			System.out.println("enter balance:");
			b[i].setBalance(sc.nextInt());
		}
			
			System.out.println();
			System.out.println();
			
			System.out.println("so the coustomer names are :---------------");
			
		for(int i=0;i<size;i++)
		{
			if((b[i].getBalance())<=1000)
			{
				System.out.println("Name : "+b[i].getCoustomerName());
			}
		}
		
		
		
	}
		
		
	
	
}