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
    public boolean isPalindrome(ListNode head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
        }

        var middle = slow;
        // 1 -> 2 -> 3 <- 4 <- 5
        // 3 -> 4 -> 5
        var prev = slow;
        var next = slow.next;
        while (next != null) {
          var curNext = next.next;
          next.next = prev;
          prev = next;
          next = curNext;
        }
        slow.next = null;

        var tail = prev;
        var paliHead = head;
        var paliTail = tail;
        var res = false;
        while (paliHead.val == paliTail.val) {
          paliHead = paliHead.next;
          paliTail = paliTail.next;
          if (paliHead == paliTail ||  paliTail == null) {
            res = true;
            break;
          }
        }

        next = null;
        while (tail != null) {
          var curNext = tail.next;
          tail.next = next;
          next = tail;
          tail = curNext;
        }

        return res;
    }
}
