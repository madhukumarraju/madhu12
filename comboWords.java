package practise;

import java.util.Scanner;

public class comboWords {

	comboWords(String a,String b)
	{
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String a=s.next();
		System.out.println("enter a string");
		String b=s.next();
		int c=a.length();
		int d=b.length();
		
		if(c>d)
		{
			System.out.println(b+a+b) ;
		}
		else
		{
			System.out.println(a+b+a);
		}

	}

}
