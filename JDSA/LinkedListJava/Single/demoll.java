import java.util.Scanner;

class demoll
{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the inputs: ");
        int n = in.nextInt();//4
        int count=0;
        while(n>0)
        {
            l.insertfront(n);//4 5 6
            count++;
            n=in.nextInt();//5 6 -1

        }
        System.out.println("total count is : " + count);
        System.out.println("fial list is : ");
        l.display();
        l.delfront();
        System.out.println("after del front : ");
        l.display();
        l.dellast();
        System.out.println("after del last : ");
        l.display();
        System.out.println("enter pos: ");
        int pos = in.nextInt();
        l.delpos(pos);
        System.out.println("after del at pos: ");
        l.display();
        System.out.println("min element in list");
        l.minelement();
        System.out.println("max element in list");
        l.maxelement();
        System.out.println("enter element to search: ");
        int a = in.nextInt();
        l.search(a);
        System.out.println("element after sorting");
        l.sort();
    }
}