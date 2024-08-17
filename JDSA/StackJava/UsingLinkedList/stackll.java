class stackll
{
    Node top;

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
    stackll()
    {
        top=null;
    }

    public void push(int val)
    {
        Node newnode = new Node(val);
        newnode.next=top;
        top=newnode;
    }

    public void display()
    {
        Node temp=top;
        while (temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}