package Queue;

public class CircularQueue {
	int front,rear,MaxSize,q[],count;

	   void createqueue(int size)
	   {
	      
	       
	      
	       front=0;
	       rear=-1;
	       MaxSize=size;
	       q=new int[size];
	   }

	   void enqueue(int e)
	   {
		   rear=(rear+1)%MaxSize;
	       q[rear]=e;
	   }

	   boolean isfull()
	   {
	       if(count==MaxSize-1)
	           return true;
	       else
	           return false;
	   }
	   int dequeue()
	   {
		   int temp=q[rear];
		   front=(front+1)%MaxSize;
	       return temp;
	   }
	    boolean isempty()
	    {
	        if(count==0)
	            return true;
	        else
	            return false;
	    }
	    void printqueue()
	    {
	    	int i= front;
	    	int c=0;
	    	while(c<count) {
	       
	            System.out.print(q[i]+"---");
	            i=(i+1)%MaxSize;
	            c++;
	    }
	}}

	