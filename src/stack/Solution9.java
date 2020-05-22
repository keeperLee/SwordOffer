package stack;

import java.util.Stack;

/**
 * 用两个栈实现队列
 */
public  class Solution9 {

    public class CQueue{
        Stack<Integer> stackA;
        Stack<Integer> stackB;
        int size;

        public CQueue() {
            stackA = new Stack<>();
            stackB = new Stack<>();
            this.size = 0;
        }

        public void appendTail(int value) {
            while(!stackA.isEmpty()){
                stackB.push(stackA.pop());
            }
            stackA.push(value);
            while(!stackB.isEmpty()){
                stackA.push(stackB.pop());
            }
            size++;
        }

        public int deleteHead() {
            if(size == 0){
                return -1;
            }
            size --;
            return stackA.pop();
        }
    }

}
