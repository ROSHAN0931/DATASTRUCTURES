import java.util.LinkedList;
import java.util.Scanner;

public class OpenHashing {
    static int size = 7;
    static LinkedList<String>[] table = new LinkedList[size];

    public static int hash(String key){
        int hashval = Math.abs(key.hashCode());
        return hashval % size;
    }

    public static void insert(String key){
        int index = hash(key);

        if(table[index]==null){
            table[index]=new LinkedList<>();
        }
        table[index].add(key);
    }

    public static void display(){
        System.out.println("OpenHashing");
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + "-->");
            if(table[i]!=null){
                for (String key : table[i]){
                    System.out.print(key + "-->");
                }
                System.out.println("null");
            }
            else {
                System.out.println("Empty");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of inputs : ");

        int n = in.nextInt();
        in.nextLine();
        int i=0;
        while (i<n){
            String str = in.nextLine();
            insert(str);
            i++;
        }
        display();
    }
}
