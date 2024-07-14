package LikendListExample;

public class Doubly_linked_list {

    Dnode root;
    void create_list()
    {
        root=null;
    }
    void insert_left(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;
        else
        {
            root.left=n;//1
            n.right=root;//2
            root=n;//3
        }
        System.out.println(data+" inserted in list");
    }
    void delete_left()
    {
        if(root==null)
            System.out.println("List empty");
        else
        {
            Dnode t=root;//1
            root=root.right;//2
            root.left=null;//3
            System.out.println(t.data+" deleted from list");
        }

    }
    void insert_right(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)//list not created then this is root
            root=n;
        else
        {
            Dnode t=root;//1
            while(t.right!=null)//2
                t=t.right;
            t.right=n;//3
            n.left=t;//4
        }
        System.out.println(data+" inserted in list");
    }
    void delete_right()
    {
        if(root==null)//list not created then this is root
            System.out.println("List empty");
        else
        {
            Dnode t=root;//1
            while(t.right!=null)//2
            {
                t=t.right;//next
            }
            if(t==root)//only one Dnode
                root=null;//reset root
            else
            {
                Dnode t2=t.left;//3
                t2.right=null;//4
            }
            System.out.println(t.data+" deleted from list");
        }

    }
    void print_list()
    {
        if(root==null)//list not created then this is root
            System.out.println("List empty");
        else
        {
            Dnode t=root;
            while(t!=null)
            {
                System.out.print("|"+t.data+"|->");
                t=t.right;
            }
        }
    }
    void rev_print_list()
    {
        if(root==null)//list not created then this is root
            System.out.println("List empty");
        else
        {
            Dnode t=root;//1
            while(t.right!=null)//2
                t=t.right;
            while(t!=null)//2
            {
                System.out.print("|"+t.data+"|->");
                t=t.left;
            }

        }
    }
}
