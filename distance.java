package practise;
import java.lang.*;
import java.util.Scanner;
public class distance 
{
	public static void main(String[] args)
	{
		int[] a= {10,11,7,12,14};
		int n=5;
		int even=0;
		int odd=0;
		int ab=0;
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
			even=a[i]+even;
			
			 
		}
		else
		{
			odd=a[i]+odd;
		}
			
		
		 
	
		}
		ab=odd-even;
		 System.out.println(ab);
		
	
 }

}
 
 
 

