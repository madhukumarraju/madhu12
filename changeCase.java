package practise;

public class changeCase {

	public static void main(String[] args) {
	String s="mAdhu";
	String s1="";
	String r=s.toLowerCase();
	System.out.println(r);
	for(int i=0;i<=r.length()-1;i++)
	{
		char c=r.charAt(i);
		if(c>'a'&&c<'z')
		{
			s1+=(char)(c-32);
		}
	}
System.out.println(s1);
	}

}
