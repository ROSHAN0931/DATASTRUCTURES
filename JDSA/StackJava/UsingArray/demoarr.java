import java.util.Scanner;

public class demoarr {
    public static void main(String[] args)
    {
        System.out.println("enter size of stack : ");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        stackarr st = new stackarr(s);
        System.out.println("enter inputs: ");
        for (int i = 0; i < s; i++) {
            int v = in.nextInt();
            st.push(v);
        }
        System.out.println("Stack elemets: ");
        st.display();
        st.pop();
        System.out.println("after deleting: ");
        st.display();
        System.out.println("top element: ");
        System.out.println(st.peek());
    }
}