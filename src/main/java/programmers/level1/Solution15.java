package programmers.level1;

public class Solution15 {
    // 이상한 문자 만들기
    public static void main(String[] args) {
        System.out.println(solution("try  hello world "));
    }

    /**
     * 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     **/

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            index = s.charAt(i) == ' ' ? 0 : index + 1;
            // "이것도 한글자로 인식하므로 홀수로 함
            answer.append(index % 2 == 1 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i)));
            // 2번의 겨우 만 맞음 => 문제가 대문자로 주어질수 있으므로 소문자로 변경해주는 코드도 해줘야함
        }

        return answer.toString();
    }
}
