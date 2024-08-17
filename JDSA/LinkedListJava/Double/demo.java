import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string inputs: ");
        String s = in.nextLine();
        while (!s.equals("exit"))
        {
            l.inserlast(s);
            s=in.nextLine();
        }
        System.out.println("final doduble list: ");
        l.display();
        System.out.println("after del last node: ");
        l.dellast();
        l.display();
        System.out.println("after inserting front");
        String s1=in.nextLine();
        l.insertfront(s1);
        l.display();
        System.out.println("after del from front: ");
        l.delfront();
        l.display();
    }
}