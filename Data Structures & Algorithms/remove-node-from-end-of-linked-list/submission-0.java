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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leader = dummy;
        ListNode current = dummy;
        for(int i=0;i<=n;i++) {
            leader = leader.next;
        }
        while(leader!=null){
            current = current.next;
            leader=leader.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }
}
