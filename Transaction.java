package com.team7.service;
import java.util.Random;
import com.team7.DAO.*;
import com.team7.ProductCategories.*;
public class Transaction 
{
	int customersTransaction[]=new int[10];
    int points[]=new int[10];
    int transactionAmmount;
    int luckyPerson;
    Random random=new Random();
     
    
    public void doTransaction()  
    {
        for(int i=100;i>=0;i--)
        {
            try 
            {
                luckyPerson=random.nextInt(10);//1 person will be selected among 10 members 
                
                transactionAmmount=random.nextInt(1000,100000);// From 1000 to 1,00,000 one transaction Ammount will be selected by random
                
                customersTransaction[luckyPerson]=customersTransaction[luckyPerson]+transactionAmmount;
                
                Thread.sleep(50);//Thread Sleeps for 0.05sec (1sec = 1000)
            } 
            catch (Exception e) 
            {
                System.out.println("Some Problem Occured During Transaction ");
            }
        } 
    }   
    public void calculatePoints(int customerNumber)
    {
    	CustomerDetailsDb cd=new CustomerDetailsDb();
    	DisplayProducts dp=new DisplayProducts();
    	
        for(int i=0;i<customersTransaction.length;i++)
        {
            points[i]=(int)customersTransaction[i]/100;//For every 100/- spent 1 point will be calculated
            
            cd.user[i].setTransactionAmmount(customersTransaction[i]);//setting the TransactionAmmount to CustomerDetails Class(i.e., CustomerDetailsDb.java)
            
            cd.user[i].setRewardPoints(points[i]);//setting the RewardsPoints to CustomerDetails Class(i.e., CustomerDetailsDb.java)
        } 
        System.out.println("*******************************************************************");
        System.out.println("Welcome "+cd.user[customerNumber].getName());
        System.out.println("Total Transaction Ammount : "+cd.user[customerNumber].getTransactionAmmount());
        System.out.println("Total Rewards Obtained    : "+cd.user[customerNumber].getRewardPoints());
        System.out.println("*******************************************************************");
        try 
        {
			Thread.sleep(5000);//thread sleeps for 5sec
			dp.displayCategories(customerNumber,cd);
		} 
        catch (InterruptedException e) 
        {
			e.printStackTrace();
		}
    } 
}
