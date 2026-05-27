/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        HashSet<ListNode> map = new HashSet<>();
        while(A!=null){
            map.add(A);
            A = A.next;
        }

        while(B!=null){
            if(map.contains(B)){
                return B;
            }
            B = B.next;
        }
        return null;
    }
}