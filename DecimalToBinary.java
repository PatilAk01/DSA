package Stack;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		 Stack obj=new Stack();
	        Scanner in =new Scanner(System.in);
	        System.out.println("Enter data:");
	        int input=in.nextInt();
	        obj.create_stack(64);
	       while(input!=0)
	        {
	            int rem =input%2;
	            obj.push(rem);
	            input=input/2;
	        }
	       
	        System.out.println("number is binary is");
	        while(obj.is_empty()!=true)
	        	System.out.print(obj.pop());


	}

}
