package practise;

public class pallindrimeint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;int sum=0;int temp;
		int n=4545;
		temp=n;
		while(n>0)
		{
			i=n%10;
			sum=(sum*10)+i;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
