package programmers.level1;

public class Solution18 {
    // 문자열을 정수로 바꾸기
    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }

    /**
     * 문자열 s를 숫자로 변환한 결과를 반환하는 함수
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     * s의 길이는 1 이상 5이하입니다.
     * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
     * s는 부호와 숫자로만 이루어져있습니다.
     * s는 "0"으로 시작하지 않습니다.
     **/

    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
