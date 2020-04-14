package list;


import java.util.List;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class Solution6 {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        while(head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        for(int i = 0 ; i < result.length ; i ++){
            result[i] = stack.pop();
        }
        return result;
    }
}
