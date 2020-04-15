package list;

import java.util.List;

/**
 * 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class Solution24 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;

        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
