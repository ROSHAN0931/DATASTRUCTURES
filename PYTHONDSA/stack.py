class Stack:
    def __init__(self):
        self.stack = []

    def is_empty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        else:
            print("Stack is empty")

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        else:
            print("Stack is empty")

    def size(self):
        return len(self.stack)

# Example usage:
stack = Stack()

# Pushing elements onto the stack
stack.push(1)
stack.push(2)
stack.push(3)

# Popping an element from the stack
print("Popped item:", stack.pop())

# Peeking at the top of the stack
print("Top item:", stack.peek())

# Checking the size of the stack
print("Size of stack:", stack.size())
