public class removeDuplicateFromsortedList {

    public static class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public static ListNode deleteDuplicates(ListNode head) {

        //handle is head is null
        if(head == null){
            return head;
        }
        ListNode originalHead = head;
        // Iterate through the linked list
        int last = head.val;
        ListNode lastheadpointer = head;
        //keep track of last unique element
        while (head != null) {
            if(head.val != last){
                //update headpointer if unique value is found
                last = head.val;
                 lastheadpointer.next = head;
                 lastheadpointer = lastheadpointer.next;

            }
            head = head.next;
        }
        //update last head to null if there are duplicates at the end
        if(head == null){
            lastheadpointer.next = head;
            lastheadpointer = lastheadpointer.next;
        }
        // Now, 'head' is null because we have reached the end of the list

        // To go back to the head, you can simply use 'originalHead'
        head = originalHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
deleteDuplicates(head);

while (head != null){
    System.out.print(head.val + "-> ");
    head = head.next;
}

        // Store a reference to the head

    }
}
