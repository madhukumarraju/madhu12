package practise;

public class palindromeStr {
	public static boolean m1(String s)
	{
		int n=0;
		int j=s.length()-1;
		while(n<j)
		{
			if(s.charAt(n)!=s.charAt(j))
				return false;
			n++;
			j--;
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		String s="abba";
		if(m1(s))
		{
			System.out.println("yes");
			
		}
		else
		System.out.println("no");
	}
}

