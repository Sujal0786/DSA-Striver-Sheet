class Solution {
    public ListNode insertBeforeHead(ListNode head, int X) {
        ListNode newNode = new ListNode(X);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }
}
