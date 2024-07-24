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
            return None

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        else:
            print("Stack is empty")
            return None

    def size(self):
        return len(self.stack)

# Example usage:
stack = Stack()

stack.push(5)
stack.push(10)
stack.push(15)

print("Stack size:", stack.size())
print("Top element:", stack.peek())

print("Popping:", stack.pop())
print("Popping:", stack.pop())
print("Popping:", stack.pop())
print("Popping:", stack.pop())  # Trying to pop from an empty stack
