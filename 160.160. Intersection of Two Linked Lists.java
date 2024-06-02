public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
        if(l1==null||l2==null)
        return null;
        ListNode t1=l1;
        ListNode t2=l2;
        while(t1!=t2){
            if(t1==null)
                t1=l2;
            else
            t1=t1.next;

            if(t2==null)
                t2=l1;
            else
            t2=t2.next;
        }
        return t1;
    }
}