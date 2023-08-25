package com.team7.ProductCategories;

import java.util.Scanner;

import com.team7.DAO.CustomerDetailsDb;
import com.team7.service.DisplayResult;

public class Clothing 
{
	public void clothing(int customerNumber,CustomerDetailsDb cd) throws InterruptedException
	{
		
		int rewardsAvailable=cd.user[customerNumber].getRewardPoints();
		DisplayProducts dp=new DisplayProducts();
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************************************");
		System.out.println("\t\tClothing");
		System.out.println("*******************************************************************");
		System.out.println("1.T-Shirt     -> 500points");
		System.out.println("2.Levis Jeans -> 1000points");
		System.out.println("3.Blazer      -> 1500points");
		System.out.println("4.Lehenga     -> 2000points");
		System.out.println("5.Back to Main categories");
		System.out.println("6.Exit");
		System.out.println("\n\tREWARDS AVAILABALE : "+cd.user[customerNumber].getRewardPoints());
		System.out.print("\nEnter Your Choice : ");
		char choice=sc.next().charAt(0);
		 
		DisplayResult dr=new DisplayResult();
		Thread.sleep(2000);
		System.out.println("*******************************************************************");
		switch(choice)
		{
			case '1': 
					  if(rewardsAvailable>=500)
					  {
						  System.out.println("Congrats You Got one T-shirt");
						  cd.user[customerNumber].addRewardsList("one T-shirt ");
						  int remainingRewards=rewardsAvailable-500;
						  cd.user[customerNumber].setRewardPoints(remainingRewards);
						  System.out.println("Remaining Rewards Available : "+cd.user[customerNumber].getRewardPoints());
						  System.out.println("*******************************************************************");
						  while(true)
						  {
							  System.out.print("Do you want to Redeem the remaining Rewards (Y/N ): ");
							  char ch=sc.next().charAt(0);
							  if(ch=='y'||ch=='Y')
							  {
								  dp.displayCategories(customerNumber,cd); 
								  break;
							  } 
							  else if(ch=='n'||ch=='N')
							  {
								  dr.displayResult(customerNumber, cd);
							  }
							  else
							  {
								  System.out.println("Please Enter a Valid Input (Y/N)");
								  continue;
							  }
						  } 
					  }
					  else
					  {
						  System.out.println("Sorry You don't Have Enough Rewards To buy this ");
						  System.out.println("Please Select Other Choice....");
						  clothing(customerNumber,cd);
						  break;
					  }
			case '2': 
				  	if(rewardsAvailable>=1000)
				  	{
				  		System.out.println("Congrats You Got ONE Levis Jeans");
				  		cd.user[customerNumber].addRewardsList("ONE Levis Jeans ");
				  		int remainingRewards=rewardsAvailable-1000;
				  		cd.user[customerNumber].setRewardPoints(remainingRewards);
				  		System.out.println("Remaining Rewards Available : "+cd.user[customerNumber].getRewardPoints());
				  		System.out.println("*******************************************************************");
						  while(true)
						  {
							  System.out.print("Do you want to Redeem the remaining Rewards (Y/N ): ");
							  char ch=sc.next().charAt(0);
							  if(ch=='y'||ch=='Y')
							  {
								  dp.displayCategories(customerNumber,cd); 
								  break;
							  } 
							  else if(ch=='n'||ch=='N')
							  {
								  dr.displayResult(customerNumber, cd);
							  }
							  else
							  {
								  System.out.println("Please Enter a Valid Input (Y/N)");
								  continue;
							  }
						  } 
				  	}
				  	else
				  	{
				  		System.out.println("Sorry You don't Have Enough Rewards To buy this ");
				  		System.out.println("Please Select Other Choice....");
				  		clothing(customerNumber,cd);
				  		break;
				  	}
			case '3': 
				  	if(rewardsAvailable>=1500)
				  	{		
				  		System.out.println("Congrats You Got One Branded New Blazer ! ");
				  		cd.user[customerNumber].addRewardsList("One Branded New Blazer ");
				  		int remainingRewards=rewardsAvailable-1500;
				  		cd.user[customerNumber].setRewardPoints(remainingRewards);
				  		System.out.println("Remaining Rewards Available : "+cd.user[customerNumber].getRewardPoints());
				  		System.out.println("*******************************************************************");
						  while(true)
						  {
							  System.out.print("Do you want to Redeem the remaining Rewards (Y/N ): ");
							  char ch=sc.next().charAt(0);
							  if(ch=='y'||ch=='Y')
							  {
								  dp.displayCategories(customerNumber,cd); 
								  break;
							  } 
							  else if(ch=='n'||ch=='N')
							  {
								  dr.displayResult(customerNumber, cd);
							  }
							  else
							  {
								  System.out.println("Please Enter a Valid Input (Y/N)");
								  continue;
							  }
						  } 
				  	}
				  	else
				  	{
				  		System.out.println("Sorry You don't Have Enough Rewards To buy this ");
				  		System.out.println("Please Select Other Choice....");
				  		clothing(customerNumber,cd);
				  		break;
				  	}
			case '4': 
			  		if(rewardsAvailable>=2000)
			  		{		
			  			System.out.println("Congrats You Got ONE-SET of Lehenga ! ");
			  			cd.user[customerNumber].addRewardsList("ONE-SET of Lehenga ");
			  			int remainingRewards=rewardsAvailable-2000;
			  			cd.user[customerNumber].setRewardPoints(remainingRewards);
			  			System.out.println("Remaining Rewards Available : "+cd.user[customerNumber].getRewardPoints());
			  			System.out.println("*******************************************************************");
						  while(true)
						  {
							  System.out.print("Do you want to Redeem the remaining Rewards (Y/N ): ");
							  char ch=sc.next().charAt(0);
							  if(ch=='y'||ch=='Y')
							  {
								  dp.displayCategories(customerNumber,cd); 
								  break;
							  } 
							  else if(ch=='n'||ch=='N')
							  {
								  dr.displayResult(customerNumber, cd);
							  }
							  else
							  {
								  System.out.println("Please Enter a Valid Input (Y/N)");
								  continue;
							  }
						  } 
			  		}
			  		else
			  		{
			  			System.out.println("Sorry You don't Have Enough Rewards To buy this ");
			  			System.out.println("Please Select Other Choice....");
			  			clothing(customerNumber,cd);
			  			break;
			  		}
			case '5': 
					  dp.displayCategories(customerNumber,cd);
		  			  break;
			case '6' : 
						dr.displayResult(customerNumber, cd);
						break;
						
		  	default:	System.out.println("Invalid Choice ...");
		  				System.out.println("Please Enter A valid Choice (1 to 5)");
		  				clothing(customerNumber,cd);			  		
		}
		sc.close();
	}
	
}
