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
    public ListNode deleteMiddle(ListNode head) {
        if(head ==null || head.next==null ){
            return null;
        }
        ListNode slow= head;
        ListNode fast = head;
        int i=0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            i++;
            fast = fast.next.next;
        }
            int j=0;
            ListNode temp = head;
        while(j<i-1){
            j++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}