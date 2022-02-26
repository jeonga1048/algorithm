package programmers.level1;

// 콜라츠 추측
public class solution07 {
    /**
     * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
     * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
     * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
     * 3. 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
     **/

    public static void main(String[] args) {
        System.out.println(solution(626331L));
    }

    //  626331일 때  488이 리턴되서  long 으로 타입변환함
    public static int solution(long num) {
        int answer = 0;

        while (num != 1 && answer < 500) {
            num = (num % 2 == 0) ? (num / 2) : (num * 3 + 1);
            answer++;
        }

        return answer == 500 ? -1 : answer;
    }

}


