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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}




// class Solution {
    
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode res = new ListNode(0);
//         ListNode head = res;
//         while(list1!=null && list2!=null){
//             if(list1.val<list2.val){
//                 res.next = list1;
//                 list1 = list1.next;
//                 res = res.next;
//             } else {
//                 res.next = list2;
//                 list2 = list2.next;
//                 res = res.next;
//             }
//         }
//         while(list1!=null){
//             res.next = list1;
//             list1 = list1.next;
//             res = res.next;
//         }
//         while(list2!=null){
//             res.next = list2;
//             list2 = list2.next;
//             res = res.next;
//         }
//         return head.next;
//     }
    
//     public ListNode sortList(ListNode head) {
//         ListNode mid = middle(head);
//         ListNode temp = mid.next;
//         mid.next = null;
//         mergeSort(head,temp);
//     }
    
//     public static mergeSort(ListNode l1,ListNode l2){
//         middle()
//         mergeSort()
//     }
    
//     public static ListNode middle(ListNode list){
//         ListNode slow = list;
//         ListNode fast = list;
//         while(fast!=null&&fast.next!=null){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return slow;
//     }
    
// }