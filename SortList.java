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
          if (head == null || head.next == null) return head;
        
        // Step 1: Split the list into two halves
        ListNode mid = findMiddle(head);
        ListNode rightHalf = mid.next;
        mid.next = null;  // Disconnect the two halves
        
        // Step 2: Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHalf);
        
        // Step 3: Merge the sorted halves
        return mergeSortedLists(left, right);
    }
    
    // Find the middle of the list using slow and fast pointers
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Move fast pointer twice as fast as slow pointer
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    // Merge two sorted lists
    private ListNode mergeSortedLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify merging
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Compare and merge nodes
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Attach remaining nodes
        current.next = (list1 != null) ? list1 : list2;
        
        return dummy.next;
    
    }
}