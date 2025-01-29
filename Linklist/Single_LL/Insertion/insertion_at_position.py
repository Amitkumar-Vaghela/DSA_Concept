class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    # Insert at a specific position
    def insert_at_position(self, data, position):
        new_node = Node(data)

        # If inserting at the start
        if position == 0:
            new_node.next = self.head
            self.head = new_node
            return

        temp = self.head
        for _ in range(position - 1):
            if temp is None:  # Position is out of bounds
                print("Position out of range")
                return
            temp = temp.next

        if temp is None:
            print("Position out of range")
            return

        new_node.next = temp.next
        temp.next = new_node

    # Display the linked list
    def display(self):
        temp = self.head
        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next
        print("None")

# Example Usage
ll = LinkedList()
ll.insert_at_position(10, 0)  # Insert at head
ll.insert_at_position(20, 1)  # Insert at position 1
ll.insert_at_position(30, 2)  # Insert at position 2
ll.insert_at_position(15, 1)  # Insert at position 1

print("Linked List after Insertions at Specific Positions:")
ll.display()


# Linked List after Insertions at Specific Positions:
# 10 -> 15 -> 20 -> 30 -> None
