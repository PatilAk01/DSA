package Assignment;

import java.util.Scanner;

public class min_stack_implementation {

	public static void main(String[] args) {
		Stack normal_stack=new Stack();
        Stack min_stack=new Stack();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size=in.nextInt();
        normal_stack.create_stack(size);
        min_stack.create_stack(size);
        int ch;
        do
        {
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Print Min\n0.Exit\n:");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                    if(normal_stack.is_full()!=true)
                    {
                        System.out.println("Enter data:");
                        int e=in.nextInt();
                        normal_stack.push(e);
                       
                        if(min_stack.is_empty()==true)
                            min_stack.push(e);
                        else
                        {
                          
                            if(e<min_stack.peek())
                            {
                                min_stack.push(e);
                                System.out.println(e+" pushed in min also");
                            }
                        }
                        System.out.println(e+" pushed");
                    }
                    else
                        System.out.println("Stack FUll");
                    break;
                case 2:
                    if(normal_stack.is_empty()!=true)
                    {
                        int temp=normal_stack.pop();
                        System.out.println(temp+" poped");
                        if(temp==min_stack.peek())
                        {
                            System.out.println(min_stack.pop()+" poped from Max_stzck");
                        }

                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 3:
                    if(normal_stack.is_empty()!=true)
                    {
                        System.out.println(normal_stack.peek()+" is at peek");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 4:
                    if(normal_stack.is_empty()!=true)//not empty
                    {
                        System.out.println("Stack has");
                        normal_stack.print_stack();
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 5:
                    if(min_stack.is_empty()!=true)
                        System.out.println("Minimun on stack is:"+min_stack.peek());
                    else
                        System.out.println("Min stack is empty");
                    break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);

    }
}
