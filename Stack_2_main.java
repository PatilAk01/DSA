package Stack;

import java.util.Scanner;

public class Stack_2_main {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	        Satck2inone obj = new Satck2inone();

	        int size, choice, element;

	        System.out.println("Enter the size of the stack:");
	        size = in.nextInt();

	        obj.create_stack(size);

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Push in Stack 1");
	            System.out.println("2. Push in Stack 2");
	            System.out.println("3. Pop from Stack 1");
	            System.out.println("4. Pop from Stack 2");
	            System.out.println("5. Peek in Stack 1");
	            System.out.println("6. Peek in Stack 2");
	            System.out.println("7. Print Stack 1");
	            System.out.println("8. Print Stack 2");
	            System.out.println("9. Exit");
	            System.out.println("Enter your choice:");

	            choice = in.nextInt();

	            switch (choice) {
	                case 1:
	                    if (obj.is_full() != true)//not full
	                    {
	                        System.out.println("Enter data:");
	                        int e = in.nextInt();
	                        obj.push1(e);
	                        System.out.println(e + " pushed");
	                    } else
	                        System.out.println("Stack1 FUll");
	                    break;
	                case 2:
	                    if (obj.is_full() != true)//not full
	                    {
	                        System.out.println("Enter data:");
	                        int e = in.nextInt();
	                        obj.push2(e);
	                        System.out.println(e + " pushed");
	                    } else
	                        System.out.println("Stack2 FUll");
	                    break;
	                case 3:
	                    if (obj.is_empty1() != true)//not empty
	                    {
	                        System.out.println(obj.pop1() + " poped");
	                    } else
	                        System.out.println("Stack1 Empty");
	                    break;
	                case 4:
	                    if (obj.is_empty2() != true)//not empty
	                    {
	                        System.out.println(obj.pop2() + " poped");
	                    } else
	                        System.out.println("Stack2 Empty");
	                    break;
	                case 5:
	                    if (obj.is_empty1() != true)//not empty
	                    {
	                        System.out.println(obj.peek1() + " is at peek");
	                    } else
	                        System.out.println("Stack1 Empty");
	                    break;
	                case 6:
	                    if (obj.is_empty2() != true)//not empty
	                    {
	                        System.out.println(obj.peek2() + " is at peek");
	                    } else
	                        System.out.println("Stack2 Empty");
	                    break;
	                case 7:
	                    if (obj.is_empty1() != true)//not empty
	                    {
	                        System.out.println("Stack has");
	                        obj.print_stack1();
	                    } else
	                        System.out.println("Stack1 Empty");
	                    break;
	                case 8:
	                    if (obj.is_empty2() != true)//not empty
	                    {
	                        System.out.println("Stack has");
	                        obj.print_stack2();
	                    } else
	                        System.out.println("Stack2 Empty");
	                    break;
	                case 0:
	                    System.out.println("Thanks for using code");
	                    break;

	            }
	        } while (choice != 0);
	    }
	}