package com.team7.RewardsApp;
import com.team7.service.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Login login=new Login();
		login.rules();
		login.userLogin();	 
	}
}
