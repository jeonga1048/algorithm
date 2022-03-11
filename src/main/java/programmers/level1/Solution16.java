package programmers.level1;

public class Solution16 {
    // 약수의 합
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    /**
     * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
     **/

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
