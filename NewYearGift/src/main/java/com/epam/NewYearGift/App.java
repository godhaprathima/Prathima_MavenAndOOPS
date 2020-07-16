package com.epam.NewYearGift;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int TotalWeight;
        System.out.println( "Child1" );
        Chocolates ch=new Chocolates();
        Laddu s=new Laddu();
        Jalebi j=new Jalebi();
        Kalakand k=new Kalakand();
        ch.SetWeight(5);
        s.SetWeight(3);
        j.SetWeight(2);
        System.out.println("No Of "+ch.GetName()+":" +ch.GetCount(5));
        System.out.println("No Of "+s.GetName()+" "+s.GetName("Laddu")+":" +s.GetCount(3));
        System.out.println("No Of "+j.GetName()+" "+s.GetName("Jalebi")+":" +j.GetCount(2));
        TotalWeight=ch.GetWeight()+s.GetWeight()+j.GetWeight();
        System.out.println("Total Weight of Gift is "+TotalWeight+" grams");
        
        
        System.out.println( "Child2" );
        ch.SetWeight(6);
        s.SetWeight(4);
        j.SetWeight(3);
        k.SetWeight(2);
        System.out.println("No Of "+ch.GetName()+":" +ch.GetCount(6));
        System.out.println("No Of "+s.GetName()+" "+s.GetName("Laddu")+":" +s.GetCount(4));
        System.out.println("No Of "+j.GetName()+" "+s.GetName("Jalebi")+":" +j.GetCount(3));
        System.out.println("No Of "+k.GetName()+" "+k.GetName("Jalebi")+":" +k.GetCount(2));
        TotalWeight=ch.GetWeight()+s.GetWeight()+j.GetWeight()+k.GetWeight();
        System.out.println("Total Weight of Gift is "+TotalWeight+" grams");
        
        
        System.out.println( "Child3" );
        ch.SetWeight(8);
        s.SetWeight(3);
        j.SetWeight(3);
        k.SetWeight(3);
        System.out.println("No Of "+ch.GetName()+":" +ch.GetCount(8));
        System.out.println("No Of "+s.GetName()+" "+s.GetName("Laddu")+":" +s.GetCount(3));
        System.out.println("No Of "+j.GetName()+" "+s.GetName("Jalebi")+":" +j.GetCount(3));
        System.out.println("No Of "+k.GetName()+" "+k.GetName("Jalebi")+":" +k.GetCount(3));
        TotalWeight=ch.GetWeight()+s.GetWeight()+j.GetWeight()+k.GetWeight();
        System.out.println("Total Weight of Gift is "+TotalWeight+" grams");
        
        
        
    }
}
