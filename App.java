package practise;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a payment option");
		String s=scn.next();
		payable p=Factory.getInstance(s);
		p.pay();

	}

}
