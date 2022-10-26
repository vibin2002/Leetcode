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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            ListNode prev = curr;
            while(curr!=null && prev.val == curr.val){
                curr = curr.next;
            }
            prev.next = curr;
        }
        return head;
    }
}