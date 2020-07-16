package com.epam.NewYearGift;

public class Chocolates {
	String Candies;
	private int  WeightofEachCandy=10,TotalWeight;
	public String GetName()
	{
		return "Candies";
	}
	public Integer GetCount(int Count)
	{
		return Count;
	}
	public void SetWeight(int count)
	{
	     TotalWeight= count*WeightofEachCandy;
	}
	public Integer GetWeight()
	{
	     return TotalWeight;
	}
	

}
