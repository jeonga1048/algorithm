package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution27 {
    // 나누어 떨어지는 숫자 배열
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5));
    }

    /**
     * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수
     * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     **/

    public static int[] solution(int[] arr, int divisor) {
        int[] answer =  Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();

        return answer.length != 0? answer: new int[]{-1};
    }
}

//    다른 사람 풀이
//    public long solution(int a, int b) {
//        return sumAtoB(Math.min(a, b), Math.max(b, a));
//    }
//
//    private long sumAtoB(long a, long b) {
//        return (b - a + 1) * (a + b) / 2;
//    }