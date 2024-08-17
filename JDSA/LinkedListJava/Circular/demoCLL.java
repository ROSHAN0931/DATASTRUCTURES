import java.util.Scanner;

public class demoCLL
{
    public static void main(String[] args)
    {
        CircularLinkedList cl = new CircularLinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the inputs: ");
        char c = in.next().charAt(0);
        while (c!='x')
        {
            cl.insertfront(c);
            c=in.next().charAt(0);
        }
        System.out.println("Circular List : ");
        cl.display();
        System.out.println("After deleting front : ");
        cl.deletefront();
        cl.display();
        System.out.println("enter the vale to be deleted : ");
        char v= in.next().charAt(0);
        cl.deletevalue(v);
        System.out.println("after deleting value : ");
        cl.display();
    }
}