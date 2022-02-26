package programmers.level1;

import java.util.Arrays;

// 평균 구하기
public class solution06 {
    /**
     * 정수를 담고 있는 배열 arr의 평균값
     * arr은 길이 1 이상, 100 이하인 배열입니다.
     * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
     **/

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
    }

    public static double solution(int[] arr) {
        // 변수들의 합과, 갯수를 구한뒤 나눠줌
        return (double) Arrays.stream(arr).sum() / Arrays.stream(arr).count();
    }

}


