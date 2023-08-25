package com.team7.service;
import com.team7.DAO.*;
import java.util.Scanner;

public class Login 
{
	public int customerNumber;
	public void userLogin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter User Name : ");
		String userName=sc.next();
		System.out.print("Enter Password : ");
		String password=sc.next();
		
		CustomerDetailsDb cd=new CustomerDetailsDb();
		int status=0;
		
		for(int i=0;i<cd.user.length;i++)
		{
			if(userName.equals(cd.user[i].getName()) && password.equals(cd.user[i].getPassword()))
			{
				status=1;
				customerNumber=i;
				break;
			}
		}
		if(status==1)
		{
			System.out.println("*******************************************************************");
			System.out.println("Login Successfull....");
			System.out.println(userName.toUpperCase()+" Please Wait for a Moment We are Calculating Your Rewards");
			Transaction transaction=new Transaction();
	        transaction.doTransaction();
	        transaction.calculatePoints(customerNumber);
		}
		else if(status==0)
		{
			System.out.println("*******************************************************************");
			System.out.println("Invalid user....");
			System.out.println("Bye ! ");
			System.out.println("*******************************************************************");
			System.exit(0);
		}
		sc.close();
	}
	public void rules()
	{
		System.out.println("*******************************************************************");
		System.out.println("\t\tREWARDS APPLICATION");
		System.out.println("*******************************************************************");
		System.out.println("For Every 100/- Spend You will get 1 point as a Reward");
		System.out.println("With The Rewards You Can buy some of the Items which are displayed");
		System.out.println("*******************************************************************");
	}
}
