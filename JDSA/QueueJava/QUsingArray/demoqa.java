public class demoqa {
    public static void main(String[] args)
    {
        qusingarray q = new qusingarray();
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(7);
        System.out.println("deleted elements are : ");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());


    }
}