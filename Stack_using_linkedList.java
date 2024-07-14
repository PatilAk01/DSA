package LikendListExample;

import java.util.Scanner;

class Stack_using_linkedList {

    node tos;
    void create_stack()
    {
        tos=null;//root is never created but assigned to 1st
    }
    void push(int data)
    {
        node n=new node(data);
        if(tos==null)//list not created then this is root
            tos=n;
        else
        {
            n.next=tos;//1
            tos=n;//2
        }
        System.out.println(data+" pushed");
    }
    void pop()
    {
        if(tos==null)//list not created then this is root
            System.out.println("Stack empty");
        else
        {
            node t=tos;//1
            tos=tos.next;//2
            System.out.println(t.data+" poped from stack");
        }
    }
    void peek()
    {
        if(tos==null)//list not created then this is root
            System.out.println("Stack empty");
        else
        {
            System.out.println(tos.data+" is at peek in stack");
        }
    }
    void print_stack()
    {
        if(tos==null)//list not created then this is root
            System.out.println("List empty");
        else
        {
            node t=tos;
            while(t!=null)
            {
                System.out.print(t.data);
                System.out.print("----");
                t=t.next;
            }
        }
    }
}
