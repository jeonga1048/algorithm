package programmers.level1;

public class Solution14 {
    // 자리수 더하기
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    public static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 자리수로 나누기
            n /= 10;
        }
        return answer;
    }
}
