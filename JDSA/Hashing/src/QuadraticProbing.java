public class QuadraticProbing {
    int[] table;
    int size;

    public QuadraticProbing(int size) {
        this.size = size;
        table = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }

    int hash(int key) {
        return key % size;
    }

    void insert(int key) {
        int hashIndex = hash(key);
        int i = 0;

        while (true) {
            int newIndex = (hashIndex + i * i) % size;
            if (table[newIndex] == -1) {
                table[newIndex] = key;
                System.out.println("Inserted " + key + " at index " + newIndex);
                break;
            }
            i++;
            if (i == size) {
                System.out.println("Table full. Cannot insert " + key);
                break;
            }
        }
    }

    void display() {
        System.out.println("\nHash Table:");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " --> " + (table[i] == -1 ? "empty" : table[i]));
        }
    }

    public static void main(String[] args) {
        QuadraticProbing h = new QuadraticProbing(10);

        int[] keys = {27, 18, 29, 28};
        for (int key : keys) {
            h.insert(key);
        }

        h.display();
    }
}
