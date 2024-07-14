package LikendListExample;

public class Circular_Linked_list {

	node root,last;
	void create_list() {
			root=last=null;
		}
	void ins3ert_left(int data ) {
		node n= new node(data);
	    if(root==null )
	    {
	    	root=last=n;
	        last.next=root;
	    }
	    else {
	    	 last.next=n;//1
	           last=n;//2
	           last.next=root;//3
	    }
	    System.out.println(data  +" inserted in list");
	}
	void delete_left() {
		
	    if(root==null)
	    {
	    	 
	    	System.out.println("list empty");
	    }
	    else {
	    node t=root;
	    if(root==last)
	    last=root=null;
	    else {
	    	root=root=last;
	    	last.next=root;
	    }
	    
	    System.out.println(t.data  +" deleted in list");
	    
	    }
	}
	void insert_right(int data ) {
	    	node n= new node(data);
	        if(root==null)
	        {
	        	root=last=n;
	            last.next=root;
	        }
	        else {
	        	last.next=n;
	        	last=n;
	        	last.next=root;
	        		
	        }
	        System.out.println(data  +" inserted right in list");
	    }
	void delete_right() {
		
	    if(root==null)
	    	System.out.println("list empty");
	    else {
	    	node t= root;
	    	node t2= root;
	    	last.next=null;
	    
	    	while(t.next!=null)
	    	{
	    		t2=t;
	    	  t=t.next;
	         }
	    	if(t==root)
	    	{
	          root=last=null;
	    	}
	    	else {
	    	last= t2;
	    	last.next=root;
	    		//t2.next=last;
	    	}
	    System.out.println(t.data  +" deleted in list");
	    
	    }
	}
	void print_list()
	{
	    if(root==null)
	        System.out.println("List empty");
	    else
	    {
	        node t=root;
	       do
	        {
	            System.out.print("|"+t.data+"|->");
	            t=t.next;
	        } while(t!=root);
	    }
	}
}