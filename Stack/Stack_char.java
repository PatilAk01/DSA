package Stack;

public class Stack_char {
	 int tos,MaxSize;
	 char s[];
	    void create_stack(int size)
	    {
	        MaxSize=size;
	        tos=-1;
	        s=new char[size];
	    }
	    void push(char e)
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
	   char pop()
	    {
	        char temp=s[tos];
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




