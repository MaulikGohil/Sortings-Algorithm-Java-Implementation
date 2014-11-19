package Prob2;

public class MergeR {
	public MergeR()
	{
		
	}
	public void mergesort(int[] a)
	{
		int l=a.length;
		int mid=l/2;
		if(l<2)
			return;
		int[] L=new int[mid];
		int[] R=new int[l-mid];
		for(int i=0;i<mid;i++)
		{
			L[i]=a[i];
		}
		for(int i=mid;i<l;i++)
		{
			R[i-mid]=a[i];
		}
		
		mergesort(L);
		mergesort(R);
		merge(L,R,a);
		
	}
	public void merge(int[] L,int[] R,int[] a)
	{   int i = 0,j=0,k=0;
		int x=L.length;
		int y=R.length;
		int z=a.length;
		while(i<x && j<y)
		{
			if(L[i]<R[j])
			{
				a[k]=L[i];
				k=k+1;
				i=i+1;
			}
			else
			{
				a[k]=R[j];
				k=k+1;
				j=j+1;
			}
		}
		while(i<x)
		{
			a[k]=L[i];
			k=k+1;
			i=i+1;
		}
		while(j<y)
		{
			a[k]=R[j];
			k=k+1;
			j=j+1;
		}
}
    public void print(int[] a)
    {
    	for(int i=0;i<a.length;i++)
    		System.out.printf("%d\n",a[i]);
    }
}