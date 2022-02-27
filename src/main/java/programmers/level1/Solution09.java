package programmers.level1;

public class Solution09 {
    // 짝수와 홀수
    public static void main(String[] args) {
        System.out.println(solution(0));
    }

    /**
     * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수,
     **/
    public static String solution(int num) {

        String answer = Math.abs(num) % 2 == 1 ? "Odd" : "Even";
        // 음수일경우 결과 실패로 뜨는 거같아서 절대값 함수 사용

        // (num)%2 == 0 ? "Even":"Odd"; 나머지가 0일경우 하면 바로 통과됨
        return answer;
    }

}
