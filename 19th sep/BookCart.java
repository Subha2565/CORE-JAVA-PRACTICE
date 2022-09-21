/* 
Program : Project based on Array : BookCart
@Author : Subhadip Das
@Date: 19/09/22

*/
import.java.util.Scanner;
// declaring a class
class  Books
{		// attributes of book
	 private String bookName;
	 private String autherName;
	 private int yearOfPublication;
	 private double bookPrice;
	 static double totalAmount;
	 
	 // method for creating a book
	 void InsertBook(String bookName,String autherName,int yearOfPublication,double bookPrice)
	 {
		this.bookName=bookName;
		this.authorName=authorName;
		this.yearOfPublication=yearOfPublication;
		this.bookPrice=bookPrice;
	 }
	 // method for calculating the cart total
	 static void CalcAmount(double price)
	 {
		 totalAmount+=price;
	 }
}// end of class

// declaring main class
class BookCart
{
	// main method
	public static void main(string...args)
	{
		Book b1[]=new Book[10]; // creating a array		of book
		Scanner sc= new Scanner(System.in);
		String choice = "no";
		do
		{
			System.out.println("Do you want to buy a book(yes/no);");
			choice=sc.next().toLowerCase();
			if(choice=="yes")
			{
				
				