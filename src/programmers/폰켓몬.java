package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class Solution2 {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        return Math.min(set.size(), max);
    }
}

public class 폰켓몬 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {3, 3, 3, 2, 2, 4};
        System.out.println(solution.solution(nums));
    }
}
