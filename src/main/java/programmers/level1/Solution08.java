package programmers.level1;

public class Solution08 {
    // 최대공약수와 최소공배수
    public static void main(String[] args) {
        System.out.println(solution(3, 12));
    }

    /**
     * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다
     **/

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        //최소공배수
        answer[1] = (m * n / answer[0]);

        return answer;
    }

}
