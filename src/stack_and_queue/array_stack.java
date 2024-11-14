package stack_and_queue;

import java.util.ArrayList;
import java.util.Arrays;

public class array_stack {
    public static void main(String[] args) throws Exception {
        ArrayStack stack = new ArrayStack();

        /* 元素入堆疊 */
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        System.out.println("堆疊 stack = " + Arrays.toString(stack.toArray()));

        /* 訪問堆疊頂元素 */
        int peek = stack.peek();
        System.out.println("堆疊頂元素 peek = " + peek);

        /* 元素出堆疊 */
        int pop = stack.pop();
        System.out.println("出堆疊元素 pop = " + pop + "，出堆疊後 stack = " + Arrays.toString(stack.toArray()));

        /* 獲取堆疊的長度 */
        int size = stack.size();
        System.out.println("堆疊的長度 size = " + size);

        /* 判斷是否為空 */
        boolean isEmpty = stack.isEmpty();
        System.out.println("堆疊是否為空 = " + isEmpty);
    }
}

class ArrayStack{
    private ArrayList<Integer> stack;

    public ArrayStack(){
        stack = new ArrayList<>();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.size()==0;
    }

    public void push(int num){
        stack.add(num);
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception();
        }
        return stack.remove(stack.size()-1);
    }

    public int peek(){
        return stack.get(stack.size()-1);
    }

    public Object[] toArray(){
        return stack.toArray();
    }
}
