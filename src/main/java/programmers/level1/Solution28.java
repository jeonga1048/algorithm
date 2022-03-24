package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution28 {
    // 같은 숫자는 싫어
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 4, 4, 3,3}));
    }

    /**
     * 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
     * 배열 arr의 원소들의 순서를 유지해야 합니다.
     **/

    public static int[] solution(int[] arr) {
        int[] answer = {};

        List<Integer> temp = new ArrayList<>();

        temp.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                temp.add(arr[i]);
            }
        }

        answer = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
