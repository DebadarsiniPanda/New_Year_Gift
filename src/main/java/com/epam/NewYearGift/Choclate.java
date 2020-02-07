package com.epam.NewYearGift;

public class Choclate extends Cadbury implements Milk
{
	String candiname;
	int price;
	Choclate(String str , int price)
	{
		candiname = str;
		this.price = price;
	}
	public String candiName()
	{
		return candiname;
	}

	public int cost()
	{
		return price;
	}
	public String toString() {
		return String.format(candiname+ " with price " + price + "rupees");
	}
	public void milk()
	{
		System.out.println("Chocolates Contains milk");
	}
}
