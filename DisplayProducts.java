package com.team7.ProductCategories;
import java.util.Scanner;
import com.team7.DAO.*;
import com.team7.service.DisplayResult;

public class DisplayProducts 
{
	CustomerDetailsDb cd=new CustomerDetailsDb();
	 
	public void displayCategories(int customerNumber,CustomerDetailsDb cd) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("*******************************************************************");
			System.out.println("\t\tMain Cetegories");
			System.out.println("*******************************************************************");
			System.out.println("1.Entertainment");
			System.out.println("2.Clothing");
			System.out.println("3.GiftCards");
			System.out.println("4.Travel");
			System.out.println("5.Exit");
			//System.out.println("\n\tREWARDS AVAILABALE : "+cd.user[customerNumber].getRewardPoints());
			System.out.println("\nPlease select Your Choice : ");
			char choice=sc.next().charAt(0);
			Thread.sleep(1000);
			switch(choice)
			{
				case '1' : 
							Entertainment e=new Entertainment();
							e.entertainment(customerNumber,cd);
							break;
				case '2' :  
							Clothing c=new Clothing();
							c.clothing(customerNumber,cd);
							break;
				case '3' : 
							GiftCards gc=new GiftCards();
							gc.giftcards(customerNumber,cd);
							break;
				case '4' :  
							Travel t=new Travel();
							t.travel(customerNumber,cd);
							break;
				 
				case '5' : 
							DisplayResult dr=new DisplayResult();
							dr.displayResult(customerNumber, cd);
							break;
							
				default: System.out.println("Invalid Input \nPLease Enter Valid Choice (1 to 6)");
						displayCategories(customerNumber,cd);
			}
			sc.close();
		}
	}
}
