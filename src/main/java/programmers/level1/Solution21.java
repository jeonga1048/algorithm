package programmers.level1;

public class Solution21 {
    // 서울에서 김서방 찾기
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    /**
     * "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수
     * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
     **/

    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer.append("김서방은 " + i + "에 있다");
            }
        }
        return answer.toString();
    }

// 다른 풀이
//    public String findKim(String[] seoul){
//        람다식을 이용해 푸는법
//        int x = Arrays.asList(seoul).indexOf("Kim");
//
//        return "김서방은 "+ x + "에 있다";
//    }
}
