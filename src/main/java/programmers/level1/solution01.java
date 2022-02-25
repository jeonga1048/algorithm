package programmers.level1;

import java.util.Scanner;
import java.util.stream.IntStream;

//직사각형 별찍기
public class solution01 {
    /**
     * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
     * n과 m은 각각 1000 이하인 자연수입니다.
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 값이 계속 출력되므로 StringBuilder 로 선언
        StringBuilder sb = new StringBuilder();
        // n번만큼 * 입력해주기
        IntStream.range(0, n).forEach(s -> sb.append("*"));
        IntStream.range(0, m).forEach(s -> System.out.println(sb));
    }
}


