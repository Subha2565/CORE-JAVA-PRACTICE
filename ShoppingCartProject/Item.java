/*
program: creating a Bean item class
@Author: Subhadip Das
@Date: 21.09.22
*/

//declaring a class

class Item
{
  // declaring properties
  private String itemName;
  private int itemQuantity;
  private double totalPrice;
  
  Item() // no args constructor
  {
  }
  // paramaterized constructor
  Item(String itemName,int itemQuantity,double unitItemPrice)
  {
	  this.itemName= itemName;
	  this.itemQuantity= itemQuantity;
	  this.totalPrice= itemQuantity *unitItemPrice;
  }
  
  
  String getItemName()
  {
	  return this.itemName;
  }
  void setItemName(String itemName)
  {
	  this.itemName=itemName;
  }
  
  
  
  
  int getItemQuantity()
  {
	  return this. itemQuantity;
  }
  void  setItemQuantity(int itemQuantity)
  {
	  this.itemQuantity=itemQuantity;
  }
  
  
  
  
   double getTotalPrice()
  {
	  return this.totalPrice;
  }
  void setTotalPrice(double totalPrice)
  {
	  this.totalPrice=totalPrice;
  }
	  
}
// end class 

