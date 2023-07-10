package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle {
    public static class ListNode {
        int val;
        ListNode next;

    }

    public static void main(String[] args) {
//        ListNode list1 = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(4, new ListNode(2,new ListNode(4))))));
        ListNode list1 = new ListNode();

        Set<Integer> list = new HashSet<>();
        while (list1 != null){
            if (list.contains(list1.val)) {
                return;
            }
            list.add(list1.val);
            list1 = list1.next;
        };

        System.out.println(false);

    }
}

