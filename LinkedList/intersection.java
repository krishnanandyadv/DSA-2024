public class intersection {
    public static void main(String[] args) {
        
    }
    
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
 class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA;
        ListNode B=headB;
        while(A!=B){
            if(A==null){
               A=headB;
            }
            else{
 A=A.next;
            }
            if( B==null){
               B=headA;
            }
            else{
 B=B.next;
            }
        }

        return A;
    }
}
}