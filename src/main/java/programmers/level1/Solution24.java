package programmers.level1;

public class Solution24 {
    // 문자열 내 p와 y의 개수
    public static void main(String[] args) {
        System.out.println(solution("Hello Java"));
    }

    /**
     * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False
     * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
     **/

    public static boolean solution(String s) {

        boolean answer = s.chars().filter(c -> c == 'y' || c == 'Y').count() == s.chars().filter(c -> c == 'p' || c == 'P').count();

        return answer;

    }
}
