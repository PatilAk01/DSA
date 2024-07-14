package Stack;

public class Stack {
	
	    int tos,MaxSize,s[];
	    void create_stack(int size)
	    {
	        MaxSize=size;
	        tos=-1;
	        s=new int[size];
	    }
	    void push(int e)
	    {
	        tos++;
	        s[tos]=e;
	    }
	    boolean is_full()
	    {
	        if(tos==MaxSize-1)
	            return true;
	        else
	            return false;
	    }
	    int pop()
	    {
	        int temp=s[tos];
	        tos--;
	        return(temp);
	    }
	    int peek()
	    {
	        return(s[tos]);
	    }
	    boolean is_empty()
	    {
	        if(tos==-1)
	            return true;
	        else
	            return false;
	    }
	    void print_stack()
	    {
	        for(int i=tos ;i>=0;i--)
	            System.out.println(s[i]);
	    }
	}



