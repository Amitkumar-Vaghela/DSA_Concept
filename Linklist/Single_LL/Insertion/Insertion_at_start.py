class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    # Insert at start
    def insert_at_start(self, data):
        new_node = Node(data)  # Create a new node
        new_node.next = self.head  # Point new node to the current head
        self.head = new_node  # Update head to the new node

    # Display the linked list
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")

# Example Usage
ll = LinkedList()
ll.insert_at_start(30)
ll.insert_at_start(20)
ll.insert_at_start(10)  # New head

print("Linked List after Insertions at Start:")
ll.display()
