public class CircularLinkedList
{
    Node head;
    Node tail;
    class Node
    {
        char data;
        Node next;

        Node(char c)
        {
            data=c;
            next=null;
        }
    }
    CircularLinkedList()
    {
        head=null;
        tail=null;
    }

    public void insertfront(char c)
    {
        Node newnode = new Node(c);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            tail.next=head;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }
    }

    public void deletefront()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }

        if(head==tail)
        {
            head=null;
            tail=null;
        }
        tail.next=head.next;
        head=head.next;
    }

    public void deletevalue(char val)
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }

        if(head.data==val)
        {
            head=null;
            tail=null;
        }
        head=head.next;
        tail.next=head;

        Node curr=head;
        Node prev=null;

        do
        {
            prev=curr;
            curr=curr.next;
        }while (curr!=head & curr.data!=val);

        if (curr.data==val)
        {
            if(curr==tail)
            {
                tail=prev;
            }
            prev.next=curr.next;
        }
    }

    public void display()
    {
        if (head==null)
        {
            System.out.println("List is empty");
        }

        Node temp=head;
        do
        {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }while (temp!=head);
        System.out.println();
    }
}
