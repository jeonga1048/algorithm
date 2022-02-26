package programmers.level1;

// 하샤드 수
public class solution05 {
    /**
     * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다
     * 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수
     * x는 1 이상, 10000 이하인 정수입니다.
     **/

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static boolean solution(int x) {
        int sum = 0; // 자리수합
        int num = x;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return x % sum == 0;
    }
        /*
     다른 풀이법
            sum = 0;
            Integer.toString(num).chars().forEach(c -> sum += c - '0');
            return num % sum == 0;
     Integer, String 참조형이라 속도 느림림
     */
}


