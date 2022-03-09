package programmers.level1;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution13 {
    //자연수 뒤집어 배열로 만들기
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        int[] answer = Stream.of(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] tmp = new int[answer.length];

        for (int i = 0; i < answer.length / 2; i++) {
            tmp[i] = answer[answer.length - i - 1];
            answer[answer.length - i - 1] = answer[i];
            answer[i] = tmp[i];
        }

        return answer;
    }
}

