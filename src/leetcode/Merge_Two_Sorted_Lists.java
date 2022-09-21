package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution5 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        while (list1 != null) {
            queue1.offer(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            queue2.offer(list2.val);
            list2 = list2.next;
        }

        while (true) {
            Integer val1 = queue1.peek();
            Integer val2 = queue2.peek();
            if (val1 == null || val2 == null) {
                break;
            }
            if (val1 <= val2) {
                result.add(val1);
                queue1.poll();
            } else {
                result.add(val2);
                queue2.poll();
            }
        }

        while (!queue1.isEmpty()) {
            result.add(queue1.poll());
        }
        while (!queue2.isEmpty()) {
            result.add(queue2.poll());
        }

        ListNode head = new ListNode(result.get(result.size() - 1));
        for (int i = result.size() - 2; i >= 0; i--) {
            head = new ListNode(result.get(i), head);
        }
        return head;
    }
}

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode answer = solution.mergeTwoLists(list1, list2);
        while (answer != null) {
            System.out.println(answer.val);
            answer = answer.next;
        }
    }
}
