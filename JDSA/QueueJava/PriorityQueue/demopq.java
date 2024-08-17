import java.util.Scanner;

public class demopq
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        priorityqueue pq = new priorityqueue();
        pq.enqueue(10,2);
        pq.enqueue(2,0);
        pq.enqueue(14,1);
        pq.enqueue(23,3);
        System.out.println("enqueue : ");
        pq.display();

        pq.dequeue();
        pq.dequeue();
        System.out.println("after dequeue : ");
        pq.display();
    }
}