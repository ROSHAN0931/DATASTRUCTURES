import java.util.EmptyStackException;

public class qusingarray
{
    static final int max=30;
    int arr[];
    int front,rear;

    qusingarray()
    {
        arr=new int[max];
        front=-1;
        rear=-1;
    }

    public void enqueue(int val)
    {
        if (rear==max-1)
        {
            throw new IndexOutOfBoundsException("queue is full");
        }
        arr[++rear]=val;
        if(front==-1)
        {
            front++;
        }
    }

    public int dequeue()
    {
        if(front==-1 || front>rear)
        {
            throw new IndexOutOfBoundsException("queue is empty");
        }
        return arr[front++];
    }
}
