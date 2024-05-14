class Queue:
    def __init__(self):
        self.queue = []

    def is_empty(self):
        return len(self.queue) == 0

    def enqueue(self, item):
        self.queue.append(item)
        
    def dequeue(self):
        if not self.is_empty():
            return self.queue.pop(0)
        else:
            print("Queue is empty")

    def peek(self):
        if not self.is_empty():
            return self.queue[0]
        else:
            print("Queue is empty")

    def size(self):
        return len(self.queue)

# Example usage:
queue = Queue()

# Enqueue elements into the queue
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)

# Dequeue an element from the queue
print("Dequeued item:", queue.dequeue())

# Peeking at the front of the queue
print("Front item:", queue.peek())

# Checking the size of the queue
print("Size of queue:", queue.size())
