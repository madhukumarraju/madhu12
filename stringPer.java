package practise;

public class stringPer {
public static void permut(String str,String ans)
{
	if(str.length()==0) {
		System.out.println(ans+"");
		return;
	}
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		String res=str.substring(0,i)+str.substring(i+1);
		permut(res,ans+c);
	}
	
}
public static void main(String[] args)
{
	String str="abc";
	permut(str,"");
}

}
