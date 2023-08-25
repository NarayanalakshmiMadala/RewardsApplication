package com.team7.service;
import java.util.List;


public class UserDetails 
{
   private String name;
   private String password;
   private int transactionAmmount;
   private int rewardPoints;
   private List<Object> rewardsList;
   
   public UserDetails() 
   {
	   
   }
   public UserDetails(String name, String password, int transactionAmmount, int rewardPoints, List<Object> list) 
   {
	super();
	this.name = name;
	this.password = password;
	this.transactionAmmount = transactionAmmount;
	this.rewardPoints = rewardPoints;
	this.setRewardsList(list);
   }
    
   public String getName() 
   {
	return name;
   }
   public void setName(String name) 
   {
	   this.name = name;
   }
   public String getPassword() {
	   return password;
   }
   public void setPassword(String password) {
	   this.password = password;
   }
   public int getTransactionAmmount() {
	   return transactionAmmount;
   }
   public void setTransactionAmmount(int transactionAmmount) {
	   this.transactionAmmount = transactionAmmount;
   }
   public int getRewardPoints() {
	   return rewardPoints;
   }
   public void setRewardPoints(int rewardPoints) {
	   this.rewardPoints = rewardPoints;
   }
    @Override
	public String toString() 
    {
    	return "UserDetails [name=" + name + ", password=" + password + ", transactionAmmount=" + transactionAmmount
			+ ", rewardPoints=" + rewardPoints + "]";
	}
	public List<Object> getRewardsList() {
		return rewardsList;
	}
	public void setRewardsList(List<Object> rewardsList) {
		this.rewardsList = rewardsList;
	}
	
	public void addRewardsList(String value) {
		 
		rewardsList.add(value);
	}

}	
