public class DeleteDoublyLinkedList {
    public ListNode removeHead(ListNode head) {
        if (head == null) {
            return null;
        }

        // Move head to next node
        head = head.next;

        // Set new head's prev to null if it exists
        if (head != null) {
            head.prev = null;
        }

        return head;
    }
}
