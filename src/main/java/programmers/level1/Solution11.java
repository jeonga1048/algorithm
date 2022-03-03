package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution11 {
    // 정수 제곱근 판별
    public static void main(String[] args) {
        System.out.println(solution(50000000000000L));
    }

    /**
     * n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
     * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성
     **/

    public static long solution(long n) {
        long answer = 0;

        long sqrt = 0;

        while (sqrt != n && sqrt < n) {

            answer++;

            sqrt = answer * answer;
        }

        return n < sqrt ? -1L : (answer + 1) * (answer + 1);
    }
}
