public class ReverseDoublyLinkedList {
    public ListNode reverse(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        ListNode temp = null;

        while (current != null) {
            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to next node (which is prev before swap)
            current = current.prev;
        }

        // After loop, temp is at the old head's prev
        // So the new head is temp.prev
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
