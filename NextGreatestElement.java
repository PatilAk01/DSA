package Assignment;

public class NextGreatestElement {
	 public static void main(String args[])
	    {
	        int arr[] = { 4, 5, 2, 10, 8 };
	        int n = arr.length;
	        printstack(arr, n);
	    }
	
	 
	 
 static void printstack(int arr[], int n)
	    {
	        int nextelement, i, j;
	          for (i = 0; i < n; i++) {
	            nextelement = -1;
	                     for (j = i + 1; j < n; j++) {
	                if (arr[i] < arr[j]) {
	                     nextelement = arr[j];
	                    break;
	                }
	            }
	              System.out.println(arr[i] + " -- " + nextelement);
	        }
	    }

	   
	}