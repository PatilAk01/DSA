package LikendListExample;

import java.util.Scanner;

import Queue.Queue;

public class Dynamic_Queue_main {
	 public static void main(String args[])
	    {
	        int ch;
	        Scanner in=new Scanner(System.in);
	       Dynamic_Queue  obj=new Dynamic_Queue ();
	       	        do
	        {
	            System.out.println("\nQueue Menu\n---------\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
	            ch=in.nextInt();
	            switch(ch)
	            {
	                case 1:
	                   
                                   int  e=in.nextInt();
	                        obj.enqueue(e);
	                        System.out.println("Data to enqueued");
	                    
	                  
	                    
	                    break;
	                case 2:
	                 
	                        obj.dequeue();
	                      
	                   
	                      
	                    break;
	                case 3:
	                   
	                        obj.print_queue();
	                    
	                    
	                    break;
	                case 0:
	                    System.out.println("Exiting.....");
	                    break;
	                default:
	                    System.out.println("Wrong option selected");
	                    break;
	            }
	        }while(ch!=0);
	    }

	}
