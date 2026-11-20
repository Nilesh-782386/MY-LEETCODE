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
    public ListNode swapPairs(ListNode head) {
   if( head == null || head.next == null) return head;
   ListNode A = head;
   ListNode B = head.next;
   ListNode C  = head.next.next;
    ListNode temp = B;
    A.next = swapPairs(C);
    temp.next = A;
     return temp;
    }
}   