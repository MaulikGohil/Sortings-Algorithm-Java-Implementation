package Prob2;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[])throws Exception
	{
		MergeItration mi=new MergeItration();
		//MergeRecursion mr=new MergeRecursion();
		MergeR mr=new MergeR();
		
		DifSort srt=new DifSort();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Howmany elemnts u want to sort");
		int n=Integer.parseInt(sc.nextLine());
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(sc.nextLine());	
		}
		
		System.out.println("enter ur choice->||1-Insertion Sort||\n||2-Bubble Sort||\n||3-Selection Sort||\n||4-MergeIteration||\n||5-MergeRecursion||");
		int choice=Integer.parseInt(sc.nextLine());
		
		if(choice==1)
			srt.doInsertion(a,n);
		
		else if(choice==2)
			srt.doBubble(a,n);
		
		else if(choice==3)
			srt.doSelection(a,n);
		
		else if(choice==4)
			mi.doMergeSort(a,n);
		
		/*else if(choice==5)
			mr.doMergeSort(a,0,a.length-1);*/
		else if(choice==5)
		{
			mr.mergesort(a);
			mr.print(a);
		}
		else
			System.out.println("???? invalid entry!!!!!");
		
		//srt.display(n);
		
	}

	
	                                  

}
