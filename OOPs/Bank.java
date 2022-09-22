/*
Program : creating class Bank to create accounts
@author: SUBHADIP DAS
@Date: 21 sept 2022

*/

//declaring class Bank

class Bank
{
	//main method
	public static void main(String ...args)
	{
		//-------Constructor injection ------//tight coupling
		
		//declaring objects of Account class
		Account acc1= new Account(3456,"Subhadip Das",45000.0);
		Account acc2= new Account(5634,"Prithwish",75020.0);
		
		// displaying the account
		System.out.println("Account ID:  "+acc1.getAccID()+"   Name:   "+acc1.getAccName()+"  Balance:  "+acc1.getBalance());
		System.out.println("Account ID:  "+acc2.getAccID()+"   Name:   "+acc2.getAccName()+"  Balance:  "+acc2.getBalance());
		
		
		//--------Getter Setter injection----------//loose coupling
		
		//declaring objects
		Account acc3= new Account();
		
		//setting the values of the object
		acc3.setAccID(7890);
		acc3.setAccName("Ayan Singh");
		acc3.setBalance(67098.98);
		
		//getting the values
		System.out.println("Account ID:  "+acc3.getAccID()+"   Name:   "+acc3.getAccName()+"  Balance:  "+acc3.getBalance());
	}
	
}