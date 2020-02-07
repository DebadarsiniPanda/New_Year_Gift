package com.epam.NewYearGift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Gift {
	
	   public static void main(String[] args) {
		  
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the number of chocolates you want to add to the gift box : ");
		   int n=sc.nextInt();
		   Choclate c[]=new Choclate[n];
		   
		   for(int i=0;i<n;i++)
	    	{
	    		System.out.println("Enter details of Chocolate "+(i+1)+":");
	    		System.out.print("Name:");
	    		String cname=sc.next();
	    		System.out.print("Price:");
	    		int cprice=sc.nextInt();
	    		c[i]=new Choclate(cname,cprice);
	    	}
		   
		 
		   
		   List<Choclate> giftbox = new ArrayList<>();
		   for(int i=0;i<n;i++) {
		   giftbox.add(c[i]);
	   }

		   Comparator<Choclate> titleComparator = (c1, c2) -> c1.candiName().compareTo(c2.candiName());
		   giftbox.sort(titleComparator);
		   
		   System.out.println("sorted list in ascending order of candie: " + giftbox);
		   giftbox.sort(Collections.reverseOrder(titleComparator));
		   
		  
		   System.out.println("The ingredients of chocolates are shown here : ");
		   
		   for(int i=0;i<n;i++) {
			   c[i].milk();
			   c[i].nuts();
			   c[i].almond();
		   }
		   
}
}
