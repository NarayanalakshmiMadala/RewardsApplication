package com.team7.DAO;
import java.util.ArrayList;
import java.util.List;

import com.team7.service.UserDetails;

public class CustomerDetailsDb 
{
	public UserDetails user[]=new UserDetails[10];
	List<Object> rewardsList=new ArrayList<>();
	public CustomerDetailsDb()
	{
		user[0]=new UserDetails("lakshmi","lakshmi",0,0,rewardsList);
		user[1]=new UserDetails("anurag","anurag",0,0,rewardsList);
		user[2]=new UserDetails("motai","motai",0,0,rewardsList);
		user[3]=new UserDetails("pugal","pugal",0,0,rewardsList);
		user[4]=new UserDetails("dhilip","dhilip",0,0,rewardsList);
		user[5]=new UserDetails("satya","satya",0,0,rewardsList);
		user[6]=new UserDetails("janardhana","janardhana",0,0,rewardsList);
		user[7]=new UserDetails("eeshanvi","eeshanvi",0,0,rewardsList);
		user[8]=new UserDetails("vinod","vinod",0,0,rewardsList);
		user[9]=new UserDetails("joni","joni",0,0,rewardsList);	 
	}
}
