package array_and_linkedList;

import utils.*;

public class linked_list {

    static void insert(ListNode n0,ListNode P){
        P.next = n0.next;
        n0.next = P;
    }

    static void remove(ListNode n0){
        if(n0.next==null){
            return;
        }
        ListNode P = n0.next;
        n0.next = P.next;
    }

    static ListNode access(ListNode head,int index){
        for (int i = 0;i < index;i++){
            if(head==null){
                return null;
            }
            head = head.next;
        }
        return head;
    }

    static int find(ListNode head, int target){
        int index = 0;
        while (head != null){
            if (head.val == target){
                return index;
            }
            head = head.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(4);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        PrintUtil.printLinkedList(n0);

        insert(n0,new ListNode(10));
        PrintUtil.printLinkedList(n0);

        remove(n1);
        PrintUtil.printLinkedList(n0);

        System.out.println(access(n0, 2).val);

        System.out.println(find(n0, 5));
    }
}
