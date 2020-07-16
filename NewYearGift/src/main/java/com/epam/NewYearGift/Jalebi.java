package com.epam.NewYearGift;

public class Jalebi extends Sweets {
	int weightofEachJalebi=30,TotalWeight;
	public String GetName(String s)
	{
		return s;
	}
	public void SetWeight(int NoofJalebis)
	{
		TotalWeight=NoofJalebis*weightofEachJalebi;
	}
	public int GetWeight()
	{
		return TotalWeight;
	}

}
