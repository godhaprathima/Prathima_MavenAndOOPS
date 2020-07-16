package com.epam.NewYearGift;

public class Kalakand extends Sweets {
	int weightofEachKalakand=40,TotalWeight;
	public String GetName(String s)
	{
		return s;
	}
	public void SetWeight(int NoofKalakands)
	{
		TotalWeight=NoofKalakands*weightofEachKalakand;
	}
	public int GetWeight()
	{
		return TotalWeight;
	}

}
