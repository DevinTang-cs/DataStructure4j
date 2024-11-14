package stack_and_queue;

import utils.ListNode;

import java.util.Arrays;

public class linkedlist_stack {
    public static void main(String[] args) throws Exception {
        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(8);
        stack.push(9);
        stack.push(5);
        stack.push(1);

        //访问栈顶元素
        int peek = stack.peek();
        System.out.println("栈顶元素为：" + peek);

        //元素出栈
        int pop = stack.pop();
        System.out.println("出栈元素为：" + pop);

        //栈的长度
        int size = stack.size();
        System.out.println("栈的长度为：" + size);

        //是否为空
        boolean isEmpty = stack.isEmpty();
        System.out.println("栈是否为空：" + isEmpty);

        System.out.println(Arrays.toString(stack.toArray()));
    }
}

class LinkedListStack {
    private ListNode stackPeek;
    private int stackSize;

    public LinkedListStack(){
        stackPeek = null;
    }

    public int size(){
        return stackSize;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void push(int num){
        ListNode node = new ListNode(num);
        node.next = stackPeek;
        stackPeek = node;
        stackSize++;
    }

    public int pop() throws Exception {
        int num = peek();
        stackPeek = stackPeek.next;
        stackSize--;
        return num;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        return stackPeek.val;
    }

    public int[] toArray(){
        ListNode node = stackPeek;
        int[] res = new int[size()];
        for (int i = res.length-1;i>=0;i--){
            res[i] = node.val;
            node = node.next;
        }
        return res;
    }
}