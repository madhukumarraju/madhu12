package practise;

public class reverseWordPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="madhu";
String[] a=s.split("");
String s1=a[a.length-1];
for(int i=a.length-2;i>=0;i--)
{
	s1+=""+a[i];
}
System.out.println(s1);
	}
	

}
