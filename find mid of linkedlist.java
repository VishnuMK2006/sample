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
    public ListNode middleNode(ListNode head) {
        int i=1;
        ListNode temp=head;
        //find the length of list
        for(i=1;temp.next!=null;i++){
            temp=temp.next;
        }
       //convert the length into given condition (ie.even-->+2,odd-->+1)
        if(i%2==1){
            i+=1;
        }else{
            i+=2;
        }
        temp=head;
     ListNode mid=null;
        i/=2;
        //travese and than return;
        for(int j=1;temp!=null;j++){
            if(j==i){
return temp;
            }else{
                temp=temp.next;
            }  
        }
        return temp;
    }
}