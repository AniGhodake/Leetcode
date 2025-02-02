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
    public ListNode mergeTwoLists(ListNode left, ListNode right) {
        if(left == null) return right;
        if(right == null) return left;

        ListNode ans = new ListNode(-1);
        ListNode mptr = ans;

        while(left != null && right != null){
            if(left.val <= right.val){
                mptr.next = left;
                mptr = left;
                left = left.next;
            }
            else{
                mptr.next = right;
                mptr = right;
                right = right.next;
            }
        }

        if(left != null){
            mptr.next = left;
        }
        if(right != null){
            mptr.next = right;
        }

        return ans.next;

    }
}