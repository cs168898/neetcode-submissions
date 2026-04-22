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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

       while(list1 != null && list2 != null){
           if (list1.val < list2.val) {
               node.next = list1;
               // increment list1
               list1 = list1.next;
           } else {
               node.next = list2;
               list2 = list2.next;
           }
           node = node.next;
       }

        // if list1 ends first and list2 is longer 
        // we add the remainder of list2 into the node
        if(list1 != null){
            // if list1 is not null, means list2 ended already
            node.next = list1; // add the remainder of list1 into the node
        } else {
            node.next = list2; // else add the remainder of list2
        }

        return dummy.next;
    }
}