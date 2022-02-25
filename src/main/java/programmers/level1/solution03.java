package programmers.level1;

// 행렬의 덧셈
public class solution03 {
    /**
     * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution 을 완성해주세요.
     * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
     **/

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 2}, {2, 3}}, new int[][]{{3, 4}, {5, 6}}));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] += arr2[i][j]; // arr1, arr2값을 더해줌
            }
        }

        return answer;
    }


}


