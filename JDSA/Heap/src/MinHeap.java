import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
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

        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMin() {
        if (size == 0) throw new RuntimeException("Heap is empty");
        int min = heap[0];
        heap[0] = heap[--size];
        heapify(0);
        return min;
    }

    private void heapify(int pos) {
        int smallest = pos;
        int left = leftChild(pos);
        int right = rightChild(pos);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != pos) {
            swap(pos, smallest);
            heapify(smallest);
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
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(0);

        System.out.println("Min Heap: " + minHeap);
        System.out.println("Extract min: " + minHeap.extractMin());
        System.out.println("Min Heap after extraction: " + minHeap);
    }
}
