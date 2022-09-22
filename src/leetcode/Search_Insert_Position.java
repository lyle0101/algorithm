package leetcode;

import java.util.Arrays;
import java.util.List;

class Solution6 {
    public int searchInsert(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        if (list.contains(target)) {
            return list.indexOf(target);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= target) {
                return i;
            }
        }
        return list.size();
    }
}

public class Search_Insert_Position {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(solution.searchInsert(nums, target));
    }
}
