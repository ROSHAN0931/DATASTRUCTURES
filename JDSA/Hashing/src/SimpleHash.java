public class SimpleHash {
    static int size = 10;
    static String table[]=new String[size];

    public static int hash(String key){
        int hashval=Math.abs(key.hashCode());
        return hashval % size;
    }

    public static void insert(String key){
        int index = hash(key);
        table[index]=key;
        System.out.println("Inserted " + key + " at index " +" " + index);
    }

    public static void display(){
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i +" : " + table[i]);
        }
    }

    public static void main(String[] args) {
        insert("sdgdcxzavdcxz");
        insert("bannanaxscds");
        insert("mango");
        display();
    }
}