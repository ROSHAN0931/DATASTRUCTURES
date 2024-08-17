class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }


    public void insertfront(int val) {
        Node newnode = new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }

    public void insertlast(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }

    public void insertmid(int pos,int val)
    {
        Node newnode = new Node(val);
        Node temp=head;
        for (int i =1;i<pos;i++)
        {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public void delfront()
    {
        head=head.next;
    }

    public void dellast()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("list is null");
        }

        if(temp.next==null)
        {
            temp=null;
        }
        else
        {
            while(temp.next.next!=null)//head.next=>secndnode.next=>thrid
            {
                temp=temp.next;//
            }
            //remove the last node
            temp.next=null;
        }
    }

    public void delpos(int pos)
    {
        Node temp=head;
        Node prev=null;

        if(pos==0)
        {
            delfront();
        }
        else
        {
            for (int i=1;i<=pos;i++)
            {
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
        }
    }

    public void minelement()
    {
        int min = head.data;
        Node temp=head;
        while(temp!=null)
        {
            if(min > temp.data)
            {
                min=temp.data;
            }
            temp=temp.next;
        }
        System.out.println(min);
    }

    public void maxelement()
    {
        int max = head.data;
        Node temp=head;
        while(temp!=null)
        {
            if(max < temp.data)
            {
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println(max);
    }

    public void search(int a)//5
    {
        Node temp = head;
        boolean found = false;
        while(temp!=null)
        {
            if(a==temp.data)
            {
                found=true;
                break;
            }
            temp = temp.next;
        }
        if(found)
        {
            System.out.println("ele found");
        }
        else
        {
            System.out.println("not found");
        }
    }

    public void sort()
    {
        if(head==null || head.next==null)
        {
            display();
        }
        else
        {
            Node curr=head;
            Node index=null;
            int temp;
            for (curr=head;curr!=null;curr=curr.next)
            {
                index=curr.next;
                for (index=curr.next;index!=null;index=index.next)
                {
                    if(curr.data > index.data)
                    {
                        temp = curr.data;
                        curr.data = index.data;
                        index.data = temp;
                    }
                }
            }
            display();
        }
    }

    public void reverse()
    {

    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}