class BookBank
{
	private String bookName;
	private String bookAuthor;
	private double bookNumber;
	private double bookPrice;
	
	  //method to insert Movie
  /* void insertBook(String bookName,String bookAuthor,double bookNumber,double bookPrice)
  {
     this.bookName=bookName;
	 this.bookAuthor=bookAuthor;
	 this.bookNumber=bookNumber;
	 this.bookPrice=bookPrice;
	 i
  } */
	
	BookBank(String bookName,String bookAuthor,double bookNumber,double bookPrice)
	{
	 this.bookName=bookName;
	 this.bookAuthor=bookAuthor;
	 this.bookNumber=bookNumber;
	 this.bookPrice=bookPrice;
	}
	void displayBookBank()
	{
	System.out.println("Book Name: "+ this.bookName+"   "+ "Author:"+ this.bookAuthor+ "  "+ "serial NUMBER: "+ this.bookNumber+ "  "+ "Price: "+ this.bookPrice);
	}
}
	//declaring class book
class Book
{
	//main method
	public static void main(String ...args)
	{
		// creating book objects
		BookBank book1= new BookBank("The railway gang","Ruskin Bond",101,200);
		
		//book1.insertBook("The railway gang","Ruskin Bond",101,200); // implicit
		
		BookBank book2= new BookBank("The great train jourmey","Ruskin Bond",102,150);
		//book2.insertBook("The great train jourmey","Ruskin Bond",102,150);
		
		BookBank book3= new BookBank("You can","Adam",103,100);
		//book3.insertBook("You can","Adam",103,100);
		
		//display all the books
		book1.displayBookBank();
		book2.displayBookBank();
		book3.displayBookBank();
		
	}
	
}
	 
	
	 
		
	 
	 
	 
	 
	 
	 
	 