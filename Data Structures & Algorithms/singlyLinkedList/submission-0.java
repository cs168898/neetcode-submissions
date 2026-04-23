
class LinkedList {

    class Node {
        int data;
        Node next;
    }

    Node head;
    int nodeCounter;

    public LinkedList() {
        this.head = null; // Initialize a new empty node
        this.nodeCounter = 0; // Initialize the node counter
    }

    public int get(int index) {
        // if index out of bounds, return -1
        if (index < 0){
            return -1;
        }

        Node current = this.head;
        int count = 0;

        // while we still havent reach the end of the list
        while (current != null) {
            if (count == index){
                // if we are at the index (the node), return the data of the node
                return current.data;
            }

            count++;
            current = current.next;
        }

        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head; // assign the current head as the second node
        head = newNode; // change the head to the new node
    }

    public void insertTail(int val) {
        Node current = this.head;
        Node insertNode = new Node(); // create a new node to insert
        insertNode.data = val; // insert the value into the new node

        if (this.head == null) {
            this.head = insertNode;
            return;
        }

        while (current.next != null){
            // traverse to the end of hte node where current will contain the last node
            current = current.next;
        }
        current.next = insertNode;
    }

    public boolean remove(int index) {
        // if index out of bounds, return -1
        if (index < 0 || head == null){
            return false;
        }

        // removing the head
        if (index == 0) {
            head = head.next;
            return true;
        }

        Node current = this.head;
        int count = 0;
        Node prev = null;

        // while we still havent reach the end of the list
        while (current != null) {
            

            if (count == index){
                // if we are at the index (the node), remove the node
                // move the next pointer to skip over the current node
                prev.next = current.next; 
                
                return true;
            }
            prev = current;
            count++;
            current = current.next;
        }

        return false;
    }

    public ArrayList<Integer> getValues() {
        Node current = this.head;
        ArrayList<Integer> array = new ArrayList<>();
        
        while (current != null) {
            array.add(current.data);
            current = current.next;
        }

        return array;
    }
}
