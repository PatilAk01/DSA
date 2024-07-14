package Stack;

import java.util.Scanner;

public class Reverse_String {
	
	    public static void main(String args[])
	    {
	        Stack_char obj=new Stack_char();
	        Scanner in =new Scanner(System.in);
	        System.out.println("Enter data:");
	        String input=in.nextLine();
	        obj.create_stack(input.length());
	        String rev="";
	        for(int i=0;i<input.length();i++)
	        {
	            obj.push (input.charAt(i));//read char and push
	        }
	        while(obj.is_empty()!=true)
	           rev=rev+obj.pop();

	        System.out.println("Reverse String is:"+rev);

	    }
	}


