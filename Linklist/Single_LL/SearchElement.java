// Iterative Java program to search
// an element in linked list

// A Linked List Node
class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class GFG {

    // Checks whether key is present in linked list
    static boolean searchKey(Node head, int key) {

        // Initialize curr with the head of linked list
        Node curr = head;

        // Iterate over all the nodes
        while (curr != null) {

            // If the current node's value is equal to key,
            // return true
            if (curr.data == key)
                return true;

            // Move to the next node
            curr = curr.next;
        }

        // If there is no node with value as key, return
        // false
        return false;
    }
	
  	// Driver code
    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 14 -> 21 -> 13 -> 30 -> 10
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(13);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        // Key to search in the linked list
        int key = 14;

        if (searchKey(head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


// output : true


// Input: 14 -> 21 -> 11 -> 30 -> 10, key = 14
// Output: Yes
// Explanation: 14 is present in the linked list.

// Input: 6 -> 21 -> 17 -> 30 -> 10 -> 8, key = 13
// Output: No
// Explanation: No node in the linked list has value = 13.

// Input: 9 -> 18 -> 27 -> 36 -> 45, key = 27
// Output: Yes
// Explanation: 27 is present in the linked list.
