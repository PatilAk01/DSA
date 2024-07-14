package LikendListExample;

import java.util.Scanner;

public class Dynamic_Stack_Example
{
    public static void main(String args[])
    {
    	Stack_using_linkedList  obj=new Stack_using_linkedList ();
        Scanner in =new Scanner(System.in);
        obj.create_stack();
        int ch;
        do
        {
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                        System.out.println("Enter data:");
                        int e=in.nextInt();
                        obj.push(e);
                        break;
                case 2:
                        obj.pop();
                        break;
                case 3:
                        obj.peek();
                        break;
                case 4:
                        obj.print_stack();
                        break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);//not with exit condition
    }
}
