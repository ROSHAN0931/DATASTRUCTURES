public class demoqll {
    public static void main(String[] args)
    {
        qusinglinkedlist q = new qusinglinkedlist();
        q.enqueue(45);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(21);
        q.enqueue(76);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("front element is: ");
        System.out.println(q.peek());
    }
}