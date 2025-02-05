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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //      ListNode a = headA, b = headB;
    
    // while (a != b) {
    //     a = (a == null) ? headB : a.next;
    //     b = (b == null) ? headA : b.next;
    // }
    
    // return a; 
        ListNode a = headA;
        ListNode b = headB;

        while(a != null && b != null){
            if(a == b){
                return a;
            }
            a = a.next;
            b = b.next;
        }

        if(a == null){ // that means B is biggeer in size
            int blen = 0;
            while(b != null){
                blen++;
                b = b.next;
            }
            
            while(blen-- >0){
                headB = headB.next;
            }
        }
        else{
            int alen = 0;
            while(a != null){
                alen++;
                a = a.next;
            }

            while(alen-- >0){
                headA = headA.next;
            }
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        

        return headA;
    }
}