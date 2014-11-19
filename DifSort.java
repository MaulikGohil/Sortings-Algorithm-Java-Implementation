package Prob2;

public class DifSort {
	
	public void doInsertion(int[] a,int n)
	{
		for(int i=1;i<n;i++)
		{
			int j=i;
			while(j>0 && a[j]<a[j-1])
			{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void doBubble(int a[],int n)
	{
		for(int i=n-1;i>0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void doSelection(int[] a,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int temp=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[temp]>a[j])
				{
					temp=j;
				}
			}
			int swap=a[temp];
			a[temp]=a[i];
			a[i]=swap;
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	
		
}
