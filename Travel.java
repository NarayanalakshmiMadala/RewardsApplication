package com.team7.ProductCategories;

import java.util.Scanner;

import com.team7.DAO.CustomerDetailsDb;
import com.team7.service.DisplayResult;

public class Travel 
{	
	public void travel(int customerNumber,CustomerDetailsDb cd) throws InterruptedException
	{
		
		int rewardsAvailable=cd.user[customerNumber].getRewardPoints();
		DisplayProducts dp=new DisplayProducts();
		Scanner sc=new Scanner(System.in);
		System.out.println("*******************************************************************");
		System.out.println("\t\tTravel");
		System.out.println("*******************************************************************");
		System.out.println("1.Ooty 2 Train Tickets        -> 2000 points");
		System.out.println("2.Goa 2 Flight Tickets        -> 2500 points");
		System.out.println("3.Singapore 1 Flight Ticket   -> 2500 points");
		System.out.println("4.Manali 2 Train Tickets      -> 2000 points");
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
					  if(rewardsAvailable>=2000)
					  {
						  System.out.println("Congrats You Got 2-Train Tickets to go Ooty");
						  System.out.println("Have a Wonderful Vacation !");
						  cd.user[customerNumber].addRewardsList("2-Train Tickets to go Ooty");
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
						  travel(customerNumber,cd);
						  break;
					  }
			case '2': 
				  	if(rewardsAvailable>=2500)
				  	{
				  		System.out.println("Congrats You Got 2-Flight Tickets To go GOA");
				  		System.out.println("Have a Wonderful Vacation !");
				  		cd.user[customerNumber].addRewardsList("2-Flight Tickets To go GOA");
				  		int remainingRewards=rewardsAvailable-2500;
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
				  		travel(customerNumber,cd);
				  		break;
				  	}
			case '3': 
				  	if(rewardsAvailable>=2500)
				  	{		
				  		System.out.println("Congrats You Got 1 - Singapore Flight Ticket");
				  		System.out.println("Have a Wonderful Vacation !");
				  		cd.user[customerNumber].addRewardsList("Singapore Flight Ticket-1");
				  		int remainingRewards=rewardsAvailable-2500;
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
				  		travel(customerNumber,cd);
				  		break;
				  	}
			case '4': 
			  		if(rewardsAvailable>=2000)
			  		{		
			  			System.out.println("Congrats You Got 2-Train Tickets to go Manali   ");
			  			System.out.println("Have a Wonderful Vacation !");
			  			cd.user[customerNumber].addRewardsList("2-Train Tickets to go Manali   ");
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
			  			travel(customerNumber,cd);
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
		  				travel(customerNumber,cd);
		}
		sc.close();
	}
}
