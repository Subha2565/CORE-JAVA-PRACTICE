/*
program: creating a Test cart 
@Author: Subhadip Das
@Date: 21.09.22
*/


class TestCart
{
	public static void main(String ...args)
	{
		//----Constructor injection-------//
		Item HEADPHONE = new Item ("BOAT",3,1200);
		Item MOBILE= new Item("ONEPLUS",2, 55000);
		Item BAG = new Item("SKYBAG", 1,5500);
		Item LAPTOP = new Item("DELL",1,66000);
		Item WATCH= new Item("TIMEX",1,7800);
		
		ShoppingCart myCart= new ShoppingCart();
		
		myCart.addItem(HEADPHONE);
		myCart.addItem(MOBILE);
		myCart.addItem(BAG);
		myCart.addItem(LAPTOP);
		myCart.addItem(WATCH);
		
		System.out.println("-------------------");
		
		System.out.println("Bill Amount :"+myCart.calculateBill());
		System.out.println("-------------------");
		
		
	}
	
	
}