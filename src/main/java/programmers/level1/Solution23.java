package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution23 {
    // 문자열 내림차순으로 배치하기
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    /**
     * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수
     * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
     **/

    public static String solution(String s) {

        String answer = Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());

        return answer;
    }
}
