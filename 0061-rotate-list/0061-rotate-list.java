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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return head;
        int size=size(head);
        if(k==0 || k%size==0)
        return head;

        if(k>size){
            k=k%size;
        }
        k=size-k;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode tail=temp;
        temp=head;
        while(k!=1)
        {
            temp=temp.next;
            k--;
        }

        tail.next=head;
        head=temp.next;
        temp.next=null;
        return head;
        
    }
    public int size(ListNode head){
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }
        return size;
    }
}
    