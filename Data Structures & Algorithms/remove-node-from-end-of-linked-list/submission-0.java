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
    public ListNode removeNthFromEnd(ListNode head, int n) {

       // using 2 pointers , we can increment the right pointer by 'n' so when the right pointer becomes null ( reaches the end ),
        // left pointer would be pointing at the correct element
        ListNode dummy = new ListNode(0,head); // create a new listnode with the head included, we included a 0 to keep left pointer 1 step
        // behind 
        ListNode left = dummy;
        ListNode right = head;

        while(n > 0){
            right = right.next; // move right pointer up by the number 'n'
            n--;
        }

        // move both pointers up to find the number before the target and link it to the number after the target
        while(right != null){
            right = right.next;
            left = left.next;
        }

        // now left pointer is pointing at the number before the target
        left.next = left.next.next; // map the target node (left.next) to the node after it

        return dummy.next;
        
    }
}




