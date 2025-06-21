public class LinearProbing {
    static int size = 5;
    static String table[]=new String[size];

    public static int hash(String key){
        int hashval = Math.abs(key.hashCode());
        return hashval % size;
    }

    public static void insert(String key){
        int index = hash(key);
        while (table[index]!=null){
            index = (index+1) % size;
        }
        table[index]=key;
    }

    public static void display(){
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + " -> " + table[i]);
        }
    }

    public static void main(String[] args) {
        insert("roshan");
        insert("deekshi");
        insert("rithika");
        insert("melita");
        insert("palaniappan");
        display();
    }
}
