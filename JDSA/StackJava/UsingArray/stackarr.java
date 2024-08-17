import java.util.EmptyStackException;

public class stackarr
{
    int arr[];
    int top;
    int capacity;

    stackarr(int size)
    {
        capacity=size;
        arr=new int[capacity];
        top=-1;
    }

    public void push(int val)
    {
        if(top==capacity)
        {
            throw new StackOverflowError("stack is full");
        }
        arr[++top]=val;
    }

    public int pop()
    {
        if(isempty())
        {
            throw new EmptyStackException();
        }
        return arr[top--];
    }

    public int peek()
    {
        if(isempty())
        {
            throw new EmptyStackException();
        }
        return arr[top];
    }

    public boolean isempty()
    {
        return top==-1;
    }

    public void display()
    {
        int temp=top;
        while (temp!=-1)
        {
            System.out.print(arr[temp] + " ");
            temp--;
        }
        System.out.println();
    }
}
