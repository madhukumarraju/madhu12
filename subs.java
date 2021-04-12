package practise;

import java.util.Scanner;

public class subs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.next();
		
		String r=s1.substring(s1.length()-2);
		
		
		System.out.println(r);
	}

}
