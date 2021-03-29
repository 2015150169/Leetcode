package leetcode_2;

/**
 * @author:Solution
 * @DATE:2021/3/2820:08
 **/
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1.val = l1.val + l2.val;
        int flag = 0;
        if(l1.val >= 10) {
            l1.val = l1.val - 10;
            flag = 1;
        }
        ListNode result = l1;
        while(l1.next != null) {
            l1 = l1.next;
            if(flag == 1) {
                l1.val = l1.val + 1;
                flag = 0;
            }
            if(l2.next != null) {
                l2 = l2.next;
                l1.val = l2.val + l1.val;
            }
            if(l1.val >= 10) {
                l1.val = l1.val - 10;
                flag = 1;
            }
        }
        while (l2.next != null) {
            l1.next = l2.next;
            l1 = l1.next;
            l2 = l2.next;
            if(flag == 1) {
                l1.val ++;
                flag = 0;
            }
            if(l1.val >= 10) {
                l1.val = l1.val - 10;
                flag = 1;
            }
        }
        if(flag == 1) {
            l1.next = new ListNode(1,null);
        }
        return result;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}