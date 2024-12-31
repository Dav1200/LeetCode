package OLD;
public class ReverseLinkedList {


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

    public static ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;

        while(cur !=null && cur.next!=null){


            ListNode temp = cur;
            cur.next  = prev;
            prev = cur;
            cur = next;
            next = cur.next;


            }

        cur.next = prev;


return cur;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(6);
        a.next.next.next = new ListNode(1);

    reverseList(a);
    }

}
