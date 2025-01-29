class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    # Insert at end
    def insert_at_end(self, data):
        new_node = Node(data)  # Create a new node
        if not self.head:  # If list is empty, make new node the head
            self.head = new_node
            return
        temp = self.head
        while temp.next:  # Traverse to the last node
            temp = temp.next
        temp.next = new_node  # Update last node's next to new node

    # Display the linked list
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")

# Example Usage
ll = LinkedList()
ll.insert_at_end(10)
ll.insert_at_end(20)
ll.insert_at_end(30)  # New node at end

print("Linked List after Insertions at End:")
ll.display()


#output
# Linked List after Insertions at End:
# 10 -> 20 -> 30 -> None
