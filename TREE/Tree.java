package TREE;

public class Tree
{
    node root;
    void create_tree()
    {
        root=null;
    }
    void insert_node(node r,node n)
    {
        if(root==null) {
            root = n;
            System.out.println(n.data + " inserted as root");
        }
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null) {
                    r.left = n;
                    System.out.println(n.data + " inserted....");
                }
                else
                    insert_node(r.left,n);
            }
            else 
            {
                if(r.right==null) {
                    r.right = n;
                    System.out.println(n.data + " inserted....");
                }
                else
                    insert_node(r.right,n);
            }
        }
    }
    void inorder(node r)//LPR
    {
        if(r!=null)
        {
            inorder(r.left);
            System.out.print(r.data+",");
            inorder(r.right);
        }
    }

    boolean search( node r,int key)
    {
        if (r==null)
            return false;
        else
        {
            boolean left,right;
            if (r.data==key)
                return true;
            else
            {
                left=search(r.left,key);
                right=search(r.right,key);
                return left || right;
            }
        }
    }
    int count_node( node r)
    {
        if (r==null)
            return 0;
        else
        {
            int left,right;
            left=count_node(r.left);
            right=count_node(r.right);
           
            return left+right+1;
            
            	
        }
    }

}
