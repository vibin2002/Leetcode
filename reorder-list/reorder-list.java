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
    public void reorderList(ListNode head) {
        ListNode front = head;
        while(front!=null)
        {
            ListNode prev = front;
            ListNode curr = front;
            while(curr.next!= null)
            {
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            ListNode temp = front.next;
            front.next = curr;
            curr.next = temp;
            front = temp;
        }
        // if()
    }
    
    // public static void traverse(ListNode head, ListNode curr,ListNode prev){
    //     if(curr == null)
    //         return;
    //     traverse(head,curr.next,curr);
    //     if(head == curr)
    //         return;
    //     prev.next = null;
    //     ListNode temp = head.next;
    //     head.next = curr;
    //     head = temp;
    // }
}
