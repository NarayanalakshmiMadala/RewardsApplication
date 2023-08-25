package com.team7.service;

import com.team7.DAO.CustomerDetailsDb;

public class DisplayResult 
{
	public void displayResult(int customerNumber,CustomerDetailsDb cd)
	{
		  System.out.println("*******************************************************************");  
		  System.out.println("Result : \n\tRemaining Rewards Available : "+cd.user[customerNumber].getRewardPoints());
		  System.out.println("-------------------------------------------------------------------");
		  System.out.println("Redeemed Rewards List");
		  for(int i=0;i<cd.user[customerNumber].getRewardsList().size();i++)
		  {
			  System.out.println("\t\t"+(i+1)+". "+cd.user[customerNumber].getRewardsList().get(i));  
		  }
		  System.out.println("-------------------------------------------------------------------");
		  System.out.println("Thanks for Using Rewards Application");
		  System.out.println("Bye ! Have a WonderFul Day ");
		  System.out.println("*******************************************************************");
		  System.exit(0);
	}
}
