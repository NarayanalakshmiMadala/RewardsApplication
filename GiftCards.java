package com.team7.ProductCategories;

import java.util.Scanner;

import com.team7.DAO.CustomerDetailsDb;
import com.team7.service.DisplayResult;

public class GiftCards 
{	
	public void giftcards(int customerNumber,CustomerDetailsDb cd) throws InterruptedException
	{
		
		int rewardsAvailable=cd.user[customerNumber].getRewardPoints();
		DisplayProducts dp=new DisplayProducts();
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************************************");
		System.out.println("\t\tGift Cards");
		System.out.println("*******************************************************************");
		System.out.println("1.Amazon Giftcard   (500/-)     -> 500 points");
		System.out.println("2.FlipKart Giftcard (500/-)     -> 500 points");
		System.out.println("3.Apple Giftcard    (1000/-)    -> 1000 points");
		System.out.println("4.Swiggy Giftcard   (1000/-)    -> 750 points");
		System.out.println("5.Back to Main categories");
		System.out.println("6.Exit");
		System.out.println("\n\tREWARDS AVAILABALE : "+cd.user[customerNumber].getRewardPoints());
		System.out.print("\nEnter Your Choice : ");
		char choice=sc.next().charAt(0);
		
		Thread.sleep(2000);
		
		DisplayResult dr=new DisplayResult();
		 
		System.out.println("*******************************************************************");
		switch(choice)
		{
			case '1': 
					  if(rewardsAvailable>=500)
					  {
						  System.out.println("Congrats You Got AMAZON Giftcard worth of 500Rs .....!");
						  cd.user[customerNumber].addRewardsList("AMAZON Giftcard worth of 500Rs  ");
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
						  giftcards(customerNumber,cd);
						  break;
					  }
			case '2': 
				  	if(rewardsAvailable>=500)
				  	{
				  		System.out.println("Congrats You Got FLIPKART Giftcard worth of 500Rs.....!");
				  		cd.user[customerNumber].addRewardsList("FLIPKART Giftcard worth of 500Rs  ");
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
				  		giftcards(customerNumber,cd);
				  		break;
				  	}
			case '3': 
				  	if(rewardsAvailable>=1000)
				  	{		
				  		System.out.println("Congrats You Got APPLE GiftCard worth of 1000Rs ......!");
				  		cd.user[customerNumber].addRewardsList("APPLE Giftcard worth of 1000Rs  ");
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
				  		giftcards(customerNumber,cd);
				  		break;
				  	}
			case '4': 
			  		if(rewardsAvailable>=750)
			  		{		
			  			System.out.println("Congrats You Got SWIGGY Giftcard worth of 1000Rs .....!");
			  			cd.user[customerNumber].addRewardsList("SWIGGY Giftcard worth of 1000Rs  ");
			  			int remainingRewards=rewardsAvailable-750;
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
			  			giftcards(customerNumber,cd);
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
		  				giftcards(customerNumber,cd);
		}
		sc.close();
	}
}
