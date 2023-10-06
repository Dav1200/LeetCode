import java.util.HashMap;
import java.util.HashSet;

public class LinkedListCycle {


      class ListNode {
     int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public static  boolean hasCycle(ListNode head) {

          //make hashset as we only need to store the head, one key
        HashSet<ListNode> a = new HashSet<>();
        //cycle through the whole list
       while(head !=null) {
           //if we see a element thats already in the hashset then return ture
           if (a.contains(head)) {
               return true;
           }
           //otherwise add the element to the hashset and move the pointer forwards
           a.add(head);
           head = head.next;

       }
          return false;
    }


    public static void main(String[] args) {

    }

}
