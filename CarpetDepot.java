// CarpetDepot.java
// Andrew Segovia
// 10-07-22

public class CarpetDepot 
{

	public static void main(String[] args) 
	{
		CarpetPurchase first = new CarpetPurchase(567890, "George Jetson", 4325, 12, 10, 10.00);
		CarpetPurchase second = new CarpetPurchase(123456, "Mr. Spacely", 8741, 450.5, 387.25, 13.99);
		
		double areaClient1 = first.calculateArea();
		double subtotalClient1 = first.calculatesubtotal(areaClient1);
		double totalClient1 = first.calculateGrandtotal(subtotalClient1);
		
		double areaClient2 = second.calculateArea();
		double subtotalClient2 = second.calculatesubtotal(areaClient2);
		double totalClient2 = second.calculateGrandtotal(subtotalClient2);
		
		
		first.displayCarpPur(areaClient1, subtotalClient1, totalClient1);
		second.displayCarpPur(areaClient2, subtotalClient2, totalClient2);
	}

}
