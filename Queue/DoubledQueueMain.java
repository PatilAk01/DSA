package Queue;

import java.util.Scanner;

public class DoubledQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ch;
	        Scanner in=new Scanner(System.in);
	        DoubledQueue  obj=new DoubledQueue();
	        System.out.println("Enter size of queue:");
	        int size=in.nextInt();
	        obj.createqueue(size);//user given size :stack
	        do
	        {
	            System.out.println("\nQueue Menu\n---------\n1.Enqueue1\n2.Dequeue1\n3.Print1\n4.Enquue2\n5.Dequeue2\n6.print3\n0.Exit\n:");
	            ch=in.nextInt();
	            switch(ch)
	            {
	                case 1:
	                    if(!obj.isfull())//if not full then take data
	                    {
	                        System.out.println("Enter data to insert:");
	                        int e=in.nextInt();
	                        obj.enqueue1(e);
	                        System.out.println("Data to enqueued");
	                    }
	                    else {
	                        System.out.println("Queue Full");
	                    }
	                    break;
	                case 2:
	                    if(!obj.isempty1())//if not Empty then dequeue
	                    {
	                        int e=obj.dequeue1();
	                        System.out.println("Data dequeued:"+e);
	                    }
	                    else
	                    {
	                        System.out.println("Queue Empty");
	                    }
	                    break;
	                case 3:
	                    if(!obj.isempty1())//if not Empty then print
	                    {
	                        System.out.println("Data in queue");
	                        obj.printqueue1();
	                    }
	                    else
	                    {
	                        System.out.println("Queue Empty");
	                    }
	                    break;

	                case 4:
	                    if(!obj.isfull())//if not full then take data
	                    {
	                        System.out.println("Enter data to insert:");
	                        int e=in.nextInt();
	                        obj.enqueue2(e);
	                        System.out.println("Data to enqueued");
	                    }
	                    else {
	                        System.out.println("Queue Full");
	                    }
	                    break;
	                case 5:
	                    if(!obj.isempty2())//if not Empty then dequeue
	                    {
	                        int e=obj.dequeue2();
	                        System.out.println("Data dequeued:"+e);
	                    }
	                    else
	                    {
	                        System.out.println("Queue Empty");
	                    }
	                    break;
	                case 6:
	                    if(!obj.isempty2())//if not Empty then print
	                    {
	                        System.out.println("Data in queue");
	                        obj.printqueue2();
	                    }
	                    else
	                    {
	                        System.out.println("Queue Empty");
	                    }
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
