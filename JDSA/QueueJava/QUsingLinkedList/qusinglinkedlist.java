public class qusinglinkedlist
{
    Node front,rear;
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    qusinglinkedlist() {
        front = rear = null;
    }
    public void enqueue(int val)
    {
        Node newnode = new Node(val);
        if (isempty())
        {
            front=rear=newnode;
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
        }
    }
    public int dequeue()
    {
        if (isempty())
        {
            throw new IllegalStateException();
        }
        int val = front.data;
        front=front.next;
        if (front==null)
        {
            rear=null;
        }
        return val;
    }
    public int peek()
    {
        if (isempty())
        {
            throw new IllegalStateException();
        }
        return front.data;
    }

    public boolean isempty()
    {
        return front==null;
    }
}
