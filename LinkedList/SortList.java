class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        List<Integer> values = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(values);

        temp = head;
        for (int val : values) {
            temp.val = val;
            temp = temp.next;
        }

        return head;
    }
}
