package programmers.level1;

public class Solution22 {
    // 문자열 다루기 기본
    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }

    /**
     * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
     * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
     **/

    public static boolean solution(String s) {

        boolean answer = s.matches("\\d") && (s.length() == 4 || s.length() == 6);

        return answer;
    }

    // 다른사람 풀이   - NumberFormatException 이용
//    public boolean solution(String s) {
//        if(s.length() == 4 || s.length() == 6){
//            try{
//                int x = Integer.parseInt(s);
//                return true;
//            } catch(NumberFormatException e){
//                return false;
//            }
//        }
//        else return false;
//    }

}
