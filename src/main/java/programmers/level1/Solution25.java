package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution25 {
    // 문자열 내 마음대로 정렬하기
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"sun", "bed", "car"}, 2));
    }

    /**
     * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
     * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
     * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
     **/

    public static String[] solution(String[] strings, int n) {

        String[] answer;
        ArrayList<String> arr = new ArrayList<>();

        // 한글자를 추가한후에 정렬
        for (int i = 0; i < strings.length; i++) {
            arr.add(strings[i].charAt(n) + strings[i]);
        }

        //정렬 방법 1
        arr.sort(Comparator.naturalOrder());// 테스트 결과 미세하게 빠름


        //  방법 2  arr.sort(String::compareTo); 미세하게 1보다 느림

        //  방법 3  Collections.sort(arr); 셋중 젤  느림

        answer = new String[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1);
        }

        return answer;
    }
}
