public class reverselinkedlist {
    
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
    public ListNode reverseList(ListNode head) {
        ListNode curt=head;
        ListNode pr=null;
    while(curt!=null){
        ListNode ahead=curt.next;
              curt.next=pr;
              pr=curt;
              curt=ahead;
    }

       return pr; 
    }
}
}
