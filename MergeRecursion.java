/*package Prob2;

public class MergeRecursion {
	int[] temp=null;
	public void doMergeSort(int[] a, int start,int end) {
		
		if((end-start)<=1)
			return;
		else
		{
		
			System.out.println("c1");
			int m=(start+end)/2;
			System.out.println("c2");
			this.doMergeSort(a,start,m);
			System.out.println("c3");
			this.doMergeSort(a,m+1, end);
			System.out.println("c4");
			this.Merge(a,start,m,m+1,end);
		}
	}

	public void Merge(int[] a, int i,int end1, int j, int end2) 
	{
	System.out.println("c5");
		int k=0;
		while(i<=end1 && j<=end2)
		{
			System.out.println("c6");
			if(a[i]<a[j])
			{
				System.out.println("c7");
				temp[k]=a[i];
				i=i+1;
				k=k+1;
				System.out.println("check1");
			}
			else
			{
				System.out.println("c8");
				temp[k]=a[j];
				j=j+1;
				k=k+1;
				System.out.println("check2");
			}
		}
		while(i<=end1)
		{
			System.out.println("c9");
			temp[k]=a[i];
			i=i+1;
			k=k+1;
		}
		while(j<=end2)
		{
			System.out.println("c10");
			temp[k]=a[j];
			j=j+1;
			k=k+1;
		}
		for(k=0;k<end2;k++)
		{
			System.out.println("c11");
			a[k]=temp[k];
		}
		
	}
}*/
