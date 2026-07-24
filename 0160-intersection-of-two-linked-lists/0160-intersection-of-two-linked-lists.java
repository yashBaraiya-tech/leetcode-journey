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
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        int l2 = 0;
        int l1 = 0;
        ListNode tmp1 = h1;
        ListNode tmp2 = h2;

        while (tmp1 != null) {
            tmp1 = tmp1.next;
            l1++;
        }
        while (tmp2 != null) {
            tmp2 = tmp2.next;
            l2++;
        }

        tmp1 = h1;
        tmp2 = h2;

        if (l1 > l2) {
            for (int i = 1; i <= l1 - l2; i++) {
                tmp1 = tmp1.next;
            }
        } else {
            for (int i = 1; i <= l2 - l1; i++) {
                tmp2 = tmp2.next;
            }
        }

        while (tmp1 != tmp2) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }

        return tmp2;
    }
}