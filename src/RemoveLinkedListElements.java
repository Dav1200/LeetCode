public class RemoveLinkedListElements {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode removeElements(ListNode head, int val) {

        //if the head is null return null;
        if (head == null) {
            return null;
        }

        //move the head to position where val is not equal to headval
        while (head != null && head.val == val) {
            head = head.next;
            ListNode temp = head;
        }

        //start fromt he new position as that is not equal to the val
        ListNode temp = head;
        //replace pointers with next next.

        while (temp != null && temp.next !=null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            }
             else {
                temp = temp.next;
            }
        }


        return head;

    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(6);
        a.next.next.next = new ListNode(1);

        removeElements(a, 6);
    }
}
