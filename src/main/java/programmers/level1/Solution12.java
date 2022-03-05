package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution12 {
    // 정수 내림차순으로 배치하기
    public static void main(String[] args) {
        System.out.println(solution(118372L));
    }

    /**
     * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     **/

    public static long solution(long n) {
        long answer = 0;

        // 정렬을 위해 한글자씩 배열로 변환
        String[] ans = String.valueOf(n).split("");
        Arrays.sort(ans, Collections.reverseOrder());


        StringBuilder sb = new StringBuilder();

        //정렬 해준 값 하나씩 더해줌
        for (String s : ans) {
            sb.append(s);
        }

        answer = Long.valueOf(String.valueOf(sb));

        return answer;

    }
}
