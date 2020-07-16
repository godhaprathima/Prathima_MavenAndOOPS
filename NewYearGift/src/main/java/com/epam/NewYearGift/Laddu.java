package com.epam.NewYearGift;

public class Laddu extends Sweets {
	int weightofEachLaddu=50,TotalWeight;
	public String GetName(String s)
	{
		return s;
	}
	public void SetWeight(int NoofLaddus)
	{
		TotalWeight=NoofLaddus*weightofEachLaddu;
	}
	public int GetWeight()
	{
		return TotalWeight ;
	}

}
