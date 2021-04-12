package practise;

import java.util.Scanner;

public class front {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a String");
		String s=scn.next();
		System.out.println("enter a first char");
		String s1=scn.next();
		boolean f=true;
		for(int i=0;i<s.length();i++)
		{
	char c=s.charAt(0);
	
	
		if(c==s.indexOf(0))
		{
			System.out.println(f);
		}
		else
		 {
			f=false;
			System.out.println(f);
		}
		
		
		
		
		}
		
	}

}
