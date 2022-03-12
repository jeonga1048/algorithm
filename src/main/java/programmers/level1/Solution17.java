package programmers.level1;

public class Solution17 {
    // 시저 암호
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }

    /**
     * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
     * 공백은 아무리 밀어도 공백입니다.
     * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
     **/

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') { //공백
                answer.append(ch);
            } else if (ch >= 'a' && ch <= 'z') { //소문자
               answer.append( ch + n > 'z' ? (char) (ch - 26 + n) : (char) (ch + n));
            } else if (ch >= 'A' && ch <= 'Z') { //대문자  , matches("^[A-Z]*$") 는 String 가 아니라 사용X
                answer.append( ch + n > 'Z' ||  ch + n > 'z' ? (char) (ch - 26 + n) : (char) (ch + n));
            }

        }
        return answer.toString();
    }
}


// 다른 사람 풀이 - 람다식과 스트림을 이용한경우
//   return s.chars().map(c -> {
//           int n = _n % 26;
//           if (c >= 'a' && c <= 'z') {
//           return 'a' + (c - 'a' + n) % 26;
//           } else if (c >= 'A' && c <= 'Z') {
//           return 'A' + (c - 'A' + n) % 26;
//           } else {
//           return c;
//           }
//           }).mapToObj(c -> String.valueOf((char)c))
//           .reduce((a, b) -> a + b).orElse("");