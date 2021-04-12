package practise;

public class armStrong {

	public static void main(String[] args) {
		int n=154;
		int temp;
		int c=0;
		int a;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
			if(temp==c)
			{
				System.out.println("armstrong");
				
			}
			else
			{
				System.out.println("not a armstrong");
			}
		
	}

}
