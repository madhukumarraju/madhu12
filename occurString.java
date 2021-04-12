package practise;

public class occurString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="maaadhu";
String s1="";
while(s.length()>0)
{
	char c=s.charAt(0);
	s1=s.replace(c+"","");
	int count=s.length()-s1.length();
	System.out.println(c+" "+count);
	s=s1;
	
}
	}

}
