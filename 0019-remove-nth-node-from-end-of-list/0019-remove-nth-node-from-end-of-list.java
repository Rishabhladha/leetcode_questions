/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode updated = reverse(head);
        ListNode data = updated;

        // remove first node of reversed list
        if(n == 1){
            data = data.next;
            return reverse(data);
        }

        int i = 1;

        while(i < n-1){
            updated = updated.next;
            i++;
        }

        updated.next = updated.next.next;

        return reverse(data);
    }
}