package Queue;

public class DoubledQueue {
	 int front1,front2,rear1,rear2,MaxSize,q[];

	   void createqueue(int size)
	   {
	       front1=0;
	       rear1=-1;
	      front2= MaxSize=size;
	      rear2=MaxSize;
	        MaxSize=size;
	       q=new int[size];
	   }

	   void enqueue1(int e)
	   {
	       rear1++;
	       q[rear1]=e;
	   }
	   void enqueue2(int e)
	   {
	       rear2--;
	       q[rear2]=e;
	   }


	   boolean isfull()
	   {
	       if(rear1+1==rear2)
	           return true;
	       else
	           return false;
	   }
	   int dequeue1()
	   {
	       int temp=q[front1];
	       front1++;
	       return temp;
	   }
	   int dequeue2()
	   {
	       int temp=q[front2];
	       front2--;
	       return temp;
	   }
	    boolean isempty1()
	    {
	        if(front1>rear1)
	            return true;
	        else
	            return false;
	    }
	    boolean isempty2()
	    {
	        if(front2<rear2)
	            return true;
	        else
	            return false;
	    }
	    void printqueue1()
	    {
	        for(int i=front1 ;i<=rear1 ;i++)
	            System.out.print(q[i]+"---");
	    }
	    void printqueue2()
	    {
	        for(int i=front2 ;i>=rear2 ;i--)
	            System.out.print(q[i]+"---");
	    }
	}

	