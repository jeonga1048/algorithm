package programmers.level1;

import java.util.Arrays;

//x만큼 간격이 있는 n개의 숫자
public class solution02 {
    /**
     * 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
     * x는 -10000000 이상, 10000000 이하인 정수입니다.
     * n은 1000 이하인 자연수입니다.
     **/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        // 배열이 long 타입이므로 형변환
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * (i + 1); //x의 배수로 늘어 나므로
        }

        return answer;
    }


}


