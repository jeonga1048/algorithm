package programmers.level1;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Solution10 {
    // 제일 작은 수 제거하기
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1}));
    }

    /**
     * arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, arr.length = 1 일경우 -1 반환
     **/

    public static int[] solution(int[] arr) {

        // 길이가 1일경우 바로 반환될수 있게
        if (arr.length == 1) { return new int[]{-1};}

        // 가장 작은값 구하기
        int min = Arrays.stream(arr).min().getAsInt();

        int[] answer = Arrays.stream(arr).filter(i -> i != min).toArray();

        return answer;

    }

}
