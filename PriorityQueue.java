package Queue;

public class PriorityQueue {
	 int front,rear,MaxSize,q[];

	   void createqueue(int size)
	   {
	       front=0;
	       rear=-1;
	       MaxSize=size;
	       q=new int[size];
	   }

	   void enqueue(int e)
	   {
	       rear++;
	       q[rear]=e;
	       for(int i=front;i<rear;i++) {
	    	   for(int j=front;j<rear;j++) {
	    		   if(q[j]>q[j+1]){
	    			   int t=q[j];
	    			   q[j]=q[j+1];
	    			   q[j+1]=t;
	    		   }
	    	   }
	       }
	   }

	   boolean isfull()
	   {
	       if(rear==MaxSize-1)
	           return true;
	       else
	           return false;
	   }
	   int dequeue()
	   {
	       int temp=q[front];
	       front++;
	       return temp;
	   }
	    boolean isempty()
	    {
	        if(front>rear)
	            return true;
	        else
	            return false;
	    }
	    void printqueue()
	    {
	        for(int i=front ;i<=rear ;i++)
	            System.out.print(q[i]+"---");
	    }
	}

	