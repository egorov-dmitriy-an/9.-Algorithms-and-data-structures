class Main {
    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static Node revert(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        int[] key = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Node head = null;
        for (int i = key.length - 1; i >= 0; i--) {
            head = new Node(key[i], head);
        }
        head = revert(head);
        printList(head);
    }
}