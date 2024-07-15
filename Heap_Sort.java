package Heap_sort;

import Algorithm.Sorting_main;

public class Heap_Sort {

	static void heap_sort(int a[])

	{

	int p_c,done;

	   for(int i=a.length-1;i>0;i--)

	       {

	           for(int j=0;j<=i;j++)

	               {

	p_c=j;

	            while (p_c>=0 && p_c/2>=0)

	                   {

	                       if (a[p_c/2]<a[p_c])

	//parent < child then swap

	                               {

	                                   int t=a[p_c/2];

	                                   a[p_c/2]=a[p_c];

	                                   a[p_c]=t;

	                                   p_c=p_c/2;

	                               }

	}

	                   int t=a[0];

	                   a[0]=a[i];

	                   a[i]=t;

	               }}}
	public static void main (String [] args)
	{
		int a[]= {20,30,6,80,60,90,20,10};
		System.out.println("before");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i ]+",");
		}
		Heap_Sort.heap_sort(a);
		System.out.println("\nafter");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i ]+",");
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}