package LikendListExample;

public class linear_Linked_List {
	node root;
void create_list() {
		root=null;
	}
void insert_left(int data ) {
	node n= new node(data);
    if(root==null)
    	root=n;
    else {
    	n.next=root;
    	root=n;
    }
    System.out.println(data  +" inserted in list");
}
void delete_left() {
	
    if(root==null)
    	System.out.println("list empty");
    else {
    node t=root;
    root=root.next;
    
    System.out.println(t.data  +" deleted in list");
    
    }
}
void insert_right(int data ) {
    	node n= new node(data);
        if(root==null)
        	root=n;
        else {
        	node t= root;
        	while(t.next!=null)
        		t=t.next;
        		t.next=n;
        }
        System.out.println(data  +" inserted right in list");
    }
void delete_right() {
	
    if(root==null)
    	System.out.println("list empty");
    else {
    	node t= root;
    	node t2= root;
    	while(t.next!=null) {
    		t2=t;
    		t=t.next;
    	}if(t==root)
    		root=null;
    	else
    		t2.next=null;
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
        while(t!=null)
        {
            System.out.print("|"+t.data+"|->");
            t=t.next;
        }
    }
}
void search_list(int key)
{
    if(root==null)//list not created then this is root
        System.out.println("List empty");
    else
    {
        node t=root;
        while(t!=null)
        {
         if(t.data==key)
         {
             System.out.println("Found in list");
             break;
         }
         t=t.next;
        }
        if(t==null)
            System.out.println("Not found in list");
    }
}
void delete_key(int key)
{
    if(root==null)//list not created then this is root
        System.out.println("List empty");
    else
    {
        node t=root;
        node t2=root;
        while(t!=null)
        {
            if(t.data==key)
            {
                System.out.println("Found in list");
                break;
            }
            t2=t;
            t=t.next;
        }
        if(t==null)
            System.out.println("Not found in list");
        else //found and check for case
        {
            if(t==root)//case 1
                root=root.next;
            else if(t.next==null)//case 2
                t2.next=null;
            else//case 3
                t2.next=t.next;
            System.out.println(t.data+" deleted from list");
        }
        }
    }
    void insert_at(int index,int data)
    {
        if(root==null)
            System.out.println("List empty");
        else
        {
          if(index==0)
          {
              node n=new node(data);
              n.next=root;
              root=n;
          }
          else
          {
            node t=root;
            node t2=root;
            int i=0;
            while(t!=null && index>0)
            {
                t2=t;
                t=t.next;
                index--;
            }
            if(t==null)
                System.out.println("Index out of range");
            else
            {
                node n=new node(data);
                t2.next=n;
                n.next=t;
            }
            System.out.println(data+"inserted");
          }
        }

    }
}








