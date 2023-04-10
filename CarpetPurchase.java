// CarpetPurchase.java
// Andrew Segovia
// 10-07-22

public class CarpetPurchase 
{
	private final static double TAXRATE = 0.0775; 
	private int customerID = 0;
	private String customerName = "XXX";
	private int carpetID = 0;
	private double length = 0.0;
	private double width = 0.0;
	private double pricePerSq = 0.0;
	
	CarpetPurchase(int customerid, String name, int carpetid, 
			double len, double wid, double price) 
	{
		customerID = customerid;
		customerName = name;
		carpetID = carpetid;
		length = len;
		width = wid;
		pricePerSq  = price;
	}
	
	public int getCustomerID() 
	{
		return customerID;
	}

	public void setCustomerID(int customerID) 
	{
		this.customerID = customerID;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public int getCarpetID() 
	{
		return carpetID;
	}

	public void setCarpetID(int carpetID) 
	{
		this.carpetID = carpetID;
	}

	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	public double getWidth() 
	{
		return width;
	}

	public void setWidth(double width) 
	{
		this.width = width;
	}

	public double getPricePerSq() 
	{
		return pricePerSq;
	}

	public void setPricePerSq(double pricePerSq) 
	{
		this.pricePerSq = pricePerSq;
	}
	
	public double calculateArea()
	{
		double total = this.length * this.width;
		return total;
	}
	
	public double calculatesubtotal(double area)
	{
		double subtotal = pricePerSq * area;
		return subtotal;
	}
	public double calculateGrandtotal(double sub)
	{
		double total = sub + (sub * TAXRATE);
		return total;
	}
	public void displayCarpPur(double area, double subtotal, double grand)
	{
		System.out.printf("Customer ID  : %d\nCustomer "
				+ "Name: %s\nCarpet ID    : %d\nArea\t     : %.2f square feet\n"
				+ "Subtotal     : $%,.2f\nGrant Total  : $%,.2f\n\n", this.customerID, 
				this.customerName, this.carpetID, area, subtotal, grand);
	}
}
