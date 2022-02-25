package programmers.level1;

// 핸드폰 번호 가리기
public class solution04 {
    /**
     * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수
     * s는 길이 4 이상, 20이하인 문자열입니다.
     **/

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }

    public static String solution(String phone_number) {
        String answer = "";

        // 숫자이면 *로 변환
        answer = phone_number.substring(0, phone_number.length() - 4).replaceAll("[0-9]", "*");

        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
    }


}


