public class LinkedList
{
    Node head;
    Node tail;

    class Node
    {
        String data;
        Node next;
        Node prev;

        Node(String val)
        {
            data=val;
            next=null;
            prev=null;
        }
    }
    LinkedList()
    {
        head=null;
        tail=null;
    }

    public void inserlast(String val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }

    public void insertfront(String val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head=newnode;
        }
        else
        {
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
    }

    public void delfront()
    {
        head=head.next;
        tail=tail.next;
    }

    public void dellast()
    {
        Node temp = tail;
        Node t1=tail.prev;
        tail.prev.next=null;
        temp.prev=null;
        tail=t1;
    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                System.out.println(temp.data);
            }
            else
            {
                System.out.print(temp.data + " <--> ");
            }
            temp = temp.next;
        }
    }
}
