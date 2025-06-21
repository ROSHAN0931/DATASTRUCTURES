import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

        private int parent(int pos) {
            return (pos - 1) / 2;
        }
    private int leftChild(int pos) {
        return 2 * pos + 1;
    }
    private int rightChild(int pos) {
        return 2 * pos + 2;
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public void insert(int element) {
        if (size == capacity) {
            throw new RuntimeException("Heap is full");
        }
        heap[size] = element;
        int current = size++;

        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMax() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return max;
    }

    private void heapify(int pos) {
        int largest = pos;
        int left = leftChild(pos);
        int right = rightChild(pos);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != pos) {
            swap(pos, largest);
            heapify(largest);
        }
    }

    public int peek() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        return heap[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(heap, size));
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(4);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(0);

        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Extract max: " + maxHeap.extractMax());
        System.out.println("Max Heap after extraction: " + maxHeap);
    }
}




//        10       ← index 0
//       /  \
//     20    30    ← indices 1 and 2
//    /  \
//  40   50        ← indices 3 and 4


//Now:
//
//Node at index 1: parent = (1 - 1) / 2 = 0 → 20's parent is 10
//
//Node at index 2: parent = (2 - 1) / 2 = 0 → 30's parent is 10
//
//Node at index 3: parent = (3 - 1) / 2 = 1 → 40's parent is 20
//
//Node at index 4: parent = (4 - 1) / 2 = 1 → 50's parent is 20
//
//It works because each level of a complete binary tree fills left to right,
//and the formula reflects that pattern.

//The 2 comes from the binary nature (two children per node) of the heap.
//
//It ensures the correct mapping between array indices and tree structure.