package LikendListExample;
public class Dynamic_Queue
{
node front,rear;
void create_queue()
{
    front=rear=null;
}
void enqueue(int data)
{
    node n=new node(data);
    if(rear==null)//queue not created
    {front=rear=n;}
    else
    {
        rear.next=n;
        rear=n;
    }
    System.out.println(data+" Enqueued");
}
void dequeue()
{
    if(front==null)//list not created then this is root
        System.out.println("List empty");
    else
    {
        node t=front;//1
        if(front==rear)
            front=rear=null;//reset both
        else
            front=front.next;//2
        System.out.println(t.data+" dequeued from queue");
    }

}
void print_queue()
{
    if(front==null)//list not created then this is root
        System.out.println("List empty");
    else
    {
        node t=front;
        while(t!=null)
        {
            System.out.print("-|"+t.data+"|-");
            t=t.next;
        }
    }
}
}
