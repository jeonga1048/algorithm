package programmers.level1;

import java.util.Arrays;

public class Solution20 {
    // 이상한 문자 만들기
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    /**
     * 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     **/

    //에라토스테네스의 체 이용
    public static int solution(int n) {
        int answer = 0;

        int[] number = new int[n + 1];

        //2부터 n까지의 수를 배열에 넣는다.
        for (int i = 2; i <= n; i++) {
            number[i] = i;
        }

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for (int i = 2; i <= n; i++) {
            if (number[i] == 0) continue;

            for (int j = 2 * i; j <= n; j += i) {
                number[j] = 0;
            }
        }

        //배열에서 0이 아닌 것들의 개수를 세준다.
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
