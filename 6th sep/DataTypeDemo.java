/*
Program: Understanding data types in java
@author: Subhadip Das
@Date: 6th sep 2022
*/
//decalraing a class
class DataTypeDemo
{
	//calling main
	static int number;
	public static void main(String[] args)
	{
		//primitive data types
		int number=78;
		short value= (short)-32769; //typecasting
		float marks=67.8f;
		double percentage=90.765;
		char grade='A';
		long hygeNumber=656456165465156162165;
		boolean status=true;
		byte b= (byte)128; //typecasting
		string firstName="subhadip"; //not a primitive data type: string is a class java.lang package
		System.out.println("The value of number is:"+number);
		System.out.println("The value of short is:"+value);
		System.out.println("The value marks is:"+marks);
		System.out.println("The value of percentage is:"+percentage);
		System.out.println("The value of grade is:"+grade);
		System.out.println("The value of hugeNumber is:"+hugeNumber);
		System.out.println("The value of status is:"+status);
		System.out.println("The value of b is:"+b);
		System.out.println("The value of firstName is:"+firstName);
	}
	//end of main
}
// end of class DataTypeDemo	