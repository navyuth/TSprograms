package myproject;

public class SellingPrice {

	public static void main(String[] args) {
		
		double priceOfItem =21000;
		double Discount;
		 if(priceOfItem < 1000) {
			 
			 double SellingPrice = priceOfItem;
			 System.out.println("Selling price is = "+SellingPrice);
		 }
		 
		 else if(priceOfItem >= 1000 && priceOfItem < 10000) {
		
			 Discount = (priceOfItem/100) * 10;
			 double SellingPrice = priceOfItem - Discount;
			 
			 System.out.println("Selling Price is = "+SellingPrice);
		 }
		 
		 else if (priceOfItem >= 10000 && priceOfItem <= 20000) {
		
			 Discount = (priceOfItem/100)* 20;
			  double SellingPrice = priceOfItem - Discount;
			  System.out.println("Selling Price is = " +SellingPrice);
		 }
		
		 else if (priceOfItem > 20000) {
			  double SellingPrice = priceOfItem;
			 System.out.println("No Discount, SellingPrice is " +SellingPrice);
			 
		 
			 
		 }
	}

}