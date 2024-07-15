package Searching;

import java.util.Scanner;

public class Searching_examole {
public static	int sequential_search(int a[],int key)

	{

	   for(int i=0;i<a.length;i++)

	       {
	           if(a[i]==key)

	               return(i);

	       }

	   return(-1);

	}
static int binary_search(int a[],int start,int end,int key)
{
if(start<=end)
{
	int mid=(start+end)/2;
	if(a[mid]==key)
	return(mid);
	/else
	//{
	//if(key<a[mid])//left return binary_search(a,start,mid-1,key);
//	else//right return binary_search(a,mid+1,end,key);
//	}
//	}
//	else
//	return(-1);
	}
public static void main(String[] args) {
	
	int a[]= {10,20,50,60,80,30};
	Scanner in=new Scanner(System.in);
	System.out.println("Array:");
	for (int i=0;i<a.length;i++)
	{
	System.out.print(a[i]+",");
	}
	System.out.print("\nEnter key to search:");
	int key=in.nextInt();
	int res=Searching_examole.sequential_search(a,key);
	if(res==-1)
	System.out.print(key+" not found in array ");
	else
	System.out.print(key+" found in array @ "+res);
	
}
}