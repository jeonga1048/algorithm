package programmers.level1;

public class Solution19 {
    // 수박수박수박수박수박수?
    public static void main(String[] args) {
        System.out.println(solution(2));
    }

    /**
     * n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
     **/

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            answer.append(i % 2 == 1 ? '수': '박');
        }


        return answer.toString();
    }
}
