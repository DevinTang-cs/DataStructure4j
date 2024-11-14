package stack_and_queue;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //初始化栈
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(7);
        stack.push(5);
        stack.push(4);
        stack.push(3);

        System.out.println(stack);
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
    }
}
