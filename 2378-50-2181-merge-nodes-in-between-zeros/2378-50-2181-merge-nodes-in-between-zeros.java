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
    public ListNode mergeNodes(ListNode head) {
        ListNode node =head;
        ListNode result=null, result1=null;
        while(node!=null)
        {
            ListNode start=node.next;
            int val=0;
            while(start!=null && start.val!=0)
            {
                val+=start.val;
                start=start.next;
            }
            if(val!=0)
            {
                if(result==null)
                {
                    result =new ListNode(val);
                    result1=result;
                }
                else{
                    result1.next=new ListNode(val);
                    result1=result1.next;
                }
            }
            node=start;
        }
         return result;
    }
}