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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int co = 0;
        ListNode res = null;
        ListNode head = null;
        while(l1!=null && l2!=null){
            int temp = l1.val+l2.val+co;
            // System.out.println(temp%10+" "+co);
            if(res == null){
                res = new ListNode(temp%10);
                head = res;
            }
            else{
                res.next = new ListNode(temp%10);
                res = res.next;
            }
            co = temp/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        System.out.print(co);
        while(l1!=null){
            int temp= l1.val+co;
            if(res == null){
                res = new ListNode(temp%10);
                head = res;
            }
            else{
                res.next = new ListNode(temp%10);
                res = res.next;
            }
            co = temp/10;
            l1 = l1.next;
        }
        while(l2!=null){
            int temp= l2.val+co;
            if(res == null){
                res = new ListNode(temp%10);
                head = res;
            }
            else{
                res.next = new ListNode(temp%10);
                res = res.next;
            }
            co = temp/10;
            l2 = l2.next;
        }
        if(co!=0){
            res.next = new ListNode(co);
        }
        return head;
    }
}