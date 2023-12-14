/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        return false;
        ListNode curr=head;
        HashMap<ListNode,Integer> map=new HashMap<>();
        while(curr!=null){
            if(map.containsKey(curr)){
                return true;
            }
            map.put(curr,1);
            curr=curr.next;
            }
            return false;
            }
      }
    