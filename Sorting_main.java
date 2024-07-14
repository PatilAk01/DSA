package Algorithm;

import java.util.Scanner;

public class Sorting_main {
	
	
	static void bubble_sort(int a[]) {
		
	      int i,j,temp;
		for( i=0;i<a.length-1;i++) {
			for( j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]){
					temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
					
				}
			}
		}
	}
	
	static void Selection_sort(int a[]) {
		
	      int i,j,min,pos;
		for( i=0;i<a.length-1;i++) {
			min=a[i];pos=i;
			for( j=i+1;j<a.length-1;j++) {
			
				if(a[j]<min){
					min=a[j];
				    pos=j;
					
				}
			
			}
			a[pos]=a[i];
			a[i]=min;
			}
		
		
	}

	static void insertction_sort(int a[]) {
		
	      int i,j,insertion_element;
		for( i=0;i<a.length-1;i++) {
			insertion_element=a[i+1];
			j=i+1;
			while(j>0 &&a[j-1]>insertion_element) {
				a[j]=a[j-1];
				j--;
				}
			
			
			a[j]=insertion_element;
			}
		
		
}
	static void quick_sort(int a[],int start,int end)

	
	
	{
	  int i=start;
	  int j=end;
	  int pivot=start;
	  while(i<j)
		{
			while(a[i]<a[pivot])
				i++;
			while(a[j]>a[pivot])
				j--;
			if(i<j)
			 {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			 }
	     }
		if(i<end)
			quick_sort(a,i+1,end);
		if(start<j)
			quick_sort(a,start,j-1);
	}

	
	 static void merger(int a[],int start,int mid,int end) {
        int i = start;
        int j = mid + 1;
        int t[] = new int[a.length];
        int ti = start;//t-index
        while (i <= mid && j <= end)
        {
            if (a[i] < a[j])
                t[ti++] = a[i++];
            else
                t[ti++] = a[j++];
        }
        while (j <= end)//copy leftover
        {
            t[ti++] = a[j++];
        }
        while (i <= mid)//copy leftover
        {
            t[ti++] = a[i++];
        }
        //copy to a
        for(i=start;i<=end;i++)
            a[i]=t[i];
    }

    static void merge_sort(int a[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            merge_sort(a,start,mid);
            merge_sort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }

   
	
	
	public static void main(String[] args) {
		// TOD Auto-generated method stub
		
	
		int a[]= {20,30,6,80,60,90,20,10};
		System.out.println("before");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i ]+",");
		}
		//Sorting_main.bubble_sort(a);
//		System.out.println(" \nafter");
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i ]+",");
		
	//Sorting_main.Selection_sort(a);
		//Sorting_main.insertction_sort(a);
	//	Sorting_main.quick_sort(a, 0, 5);
		Sorting_main.merge_sort(a, 0, a.length-1);
		System.out.println("\nafter");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i ]+",");
	}

}}
