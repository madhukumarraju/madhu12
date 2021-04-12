package practise;

public class rotateLeft {
	public static void main(String[] args)
	
	{
		int[] a= {1,2,3,4,5};
		int n=1;
		int j;
		int first;
		for(int i=0;i<n;i++)
		{
			first=a[0];
			
		
		for(j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
			
		}
		a[j]=first;
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}}
	