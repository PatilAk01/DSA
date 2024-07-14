package Stack;

import java.util.Scanner;

public class reverse_stack {

	public static void main(String[] args) {
		 {
		      
		        Stack_char rev=new Stack_char();
		        Scanner in =new Scanner(System.in);
		        System.out.println("Enter data:");
		        String input=in.next();
		        boolean flag=true;
		        rev.create_stack(input.length());
		        for(int i=0;i<input.length();i++) {
		            char c = input.charAt(i);//read char by char
		            rev.push(c);
		        }
		        rev.print_stack();
		        }
		 }
	}