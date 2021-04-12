package practise;

public class reverseStr {

	public static void main(String[] args) {
		String s="madhu";
		char[] a=s.toCharArray();
		String s1="";
		for(int i=a.length-1;i>=0;i--) {
			s1+=a[i];
			
		}
		System.out.println(s1);
	}
}
