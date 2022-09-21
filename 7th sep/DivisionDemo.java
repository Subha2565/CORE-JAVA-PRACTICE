/*
Program: Divosion of two Numbers
@author: Subhadip Das
@Date: 7th sep 2022
*/
//decalraing a class
class DivisionDemo
{
	//calling main
	public static void main(String[] args)
	{
		float num1=Float.parseFloat(args[0]);
		float num2=Float.parseFloat(args[1]);
		float division=num1/num2;
		float r=num1%num2;
		System.out.println("The division is :"+division);
		System.out.println("The r is :"+r);
	}
	//end of main
}
// end of class DivisionDemo	