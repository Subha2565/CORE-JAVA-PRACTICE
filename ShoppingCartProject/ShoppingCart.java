/*
program: creating a Shopingcart class
@Author: Subhadip Das
@Date: 21.09.22
*/


class ShoppingCart
{
	private Item[] cart;
	private double billAmount;
	private int storedItems;
	
	// constructor to create cart of 5 items
	ShoppingCart()
	{
		cart= new Item[5];
	}
	
	// constructor to create cart of n items
	ShoppingCart(int size)
	{
		cart = new Item[size];
	}
	
	// method to calculate total bill
	public double calculateBill()
	{
		for(int i=0; i<cart.length;i++)
		{
			billAmount+= cart[i].getTotalPrice();
		}
		
		return billAmount;
	}
	
	// method to add item in the cart
	
	public void addItem(Item input)
	{
		if(storedItems<cart.length)
		{
			cart[storedItems]=input;
			storedItems++;
			// to print items added in my cart
			System.out.println(input.getItemName() + ": " + input.getTotalPrice());
		}
		else
		{
			System.out.println("Shopping cart is full");
		}
	}
}