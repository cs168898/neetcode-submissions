class Solution {
    public void reorderList(ListNode head) {
        // create one slow and fast pointer because when the fast pointer reaches the end, the slow pointer will be at the middle
        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // now pointer slow is at the middle point and fast is at the end
        // we reverse the second half of the list, which the head is at 'slow' variable
        ListNode second = slow.next; // since slow only points to the end of the first half, we move it up by one more
        ListNode prev = slow.next = null; // the slow.next = null breaks the link between the 2 halves
        while(second != null){
            ListNode temp = second.next; // store the next pointer into a variable
            second.next = prev; // set the pointer of the next number to the previous number ( reversing the order )
            prev = second; // save the current number to use in the next iteration
            second = temp; // move on to the next 
            
        }

        // combine both lists together
        // 'slow' is the head of the reversed list
        ListNode firstList = head;
        second = prev;
        while( second != null){
            ListNode temp1 = firstList.next;
            ListNode temp2 = second.next;
            firstList.next = second; // assign the next number in the first half of the list to start of second list
            second.next = temp1; // then after changing hte second element in the list, we link the third element iwth the next item in firstList
            firstList = temp1;
            second = temp2;
        }

    }
}
