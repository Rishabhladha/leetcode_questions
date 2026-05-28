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

    public ListNode mergeTwoNode(ListNode list1, ListNode list2){
        ListNode newNode = new ListNode(-1,null);
        ListNode temp = newNode;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
            temp.next=list1;
            list1=list1.next;
        }else{
            temp.next=list2;
            list2=list2.next;
        }
        temp =temp.next;
        }
        while(list1!=null){
            temp.next =list1;
            list1= list1.next;
            temp = temp.next;
        }
        while(list2!=null){
            temp.next=list2;
            list2 = list2.next;
            temp= temp.next;
        }
        return newNode.next;
        
    }

    public ListNode findmid(ListNode head){
        
        if(head==null || head.next==null){
            return head;
        }

        ListNode slow= head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }

        ListNode mid = findmid(head);

        ListNode right = mid.next;
        mid.next =null;
        ListNode left = head;

         left = sortList(left);
        right = sortList(right);

        return mergeTwoNode(left,right);
    }
}