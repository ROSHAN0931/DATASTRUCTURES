import java.util.Scanner;

class demosll
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        stackll st = new stackll();
        System.out.println("enter the inputs: ");
        int n = in.nextInt();
        while (n!=-1)
        {
            st.push(n);
            n=in.nextInt();
        }
        System.out.println("elements in stack: ");
        st.display();
    }
}