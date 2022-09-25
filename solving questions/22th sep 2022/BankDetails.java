/*
Program: creat a bank and display the people with balance less than 1000

@author: SUBHADIP DAS
@Date: 23 sept 2022
*/

//declaring a class BankDetailsount

class BankDetails
{
	//declaring instance variable
	
	private int bankId;
	private String coustomerName;
	private double balance;
	
	//default constructor no arg constructor
    BankDetails()
	{
		
	}
	
	//parameterized constructor
	BankDetails(int bankId,String coustomerName,double balance)
	{
		this.bankId=bankId;
		this.coustomerName=coustomerName;
		this.balance=balance;
		
	}
	
	
	public int getBankId()
	{
		return this.bankId;
	}
	
	public void setBankId(int bankId)
	{
		this.bankId=bankId;
	}

	
	public String getCoustomerName()
	{
		return this.coustomerName;
	}
	
	public void setCoustomerName(String coustomerName)
	{
		this.coustomerName=coustomerName;
	}
	
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
}
