package programmers;

import java.util.HashMap;

class Solution1 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String c : completion) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (String p : participant) {
            if (!map.containsKey(p) || map.get(p) == 0) {
                return p;
            } else {
                map.put(p, map.get(p) - 1);
            }
        }
        return "";
    }
}

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution.solution(participant, completion));
    }
}
