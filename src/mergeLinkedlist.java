public class mergeLinkedlist {
    int val;
    mergeLinkedlist next;

    mergeLinkedlist() {
    }

    mergeLinkedlist(int val) {
        this.val = val;
    }

    mergeLinkedlist(int val, mergeLinkedlist next) {
        this.val = val;
        this.next = next;
    }

    static class Solution {




        public static mergeLinkedlist mergeTwoLists(mergeLinkedlist list1, mergeLinkedlist list2) {

//use iterative approach to do this
            //move the two pointer to next lowest
            if(list1!=null && list2 !=null){
                if(list1.val<list2.val){
                    list1.next = mergeTwoLists(list1.next,list2);
                    return list1;
                }
                else{
                    list2.next = mergeTwoLists(list1,list2.next);
                    return list2;
                }

            }


            if(list1==null){
                return list2;
            }
            return list1;

        }

        public static void main(String[] args) {
            mergeLinkedlist a = new mergeLinkedlist();
            mergeLinkedlist b = new mergeLinkedlist();
            mergeLinkedlist c = new mergeLinkedlist();
            a.val = 1;
            a.next = b;
            b.val = 2;
            b.next = c;
            c.val = 4;

            mergeLinkedlist aa = new mergeLinkedlist();
            mergeLinkedlist bb = new mergeLinkedlist();
            mergeLinkedlist cc = new mergeLinkedlist();
            aa.val = 0;
            aa.next = bb;
            bb.val = 3;
            bb.next = cc;
            cc.val = 4;

            System.out.println( mergeTwoLists(a,aa).val);







            //System.out.println(a.val);


        }


    }

}
