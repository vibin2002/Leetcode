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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode l1,ListNode l2){
                return l1.val-l2.val;
            }
        });
        
        ListNode head = new ListNode(0);
        ListNode p = head;
        
        for(ListNode list:lists){
            if(list!=null)
                q.offer(list);
        }
        
        while(!q.isEmpty()){
            ListNode n = q.poll();
            p.next = n;
            p = p.next;
            if(n.next!=null)
                q.offer(n.next);
        }
        return head.next;
        
    }
}