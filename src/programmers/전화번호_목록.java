package programmers;

import java.util.Arrays;

class Solution3 {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(phone_book[i - 1])) {
                return false;
            }
        }
        return true;
    }
}

public class 전화번호_목록 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        System.out.println(solution.solution(phone_book));
    }
}
