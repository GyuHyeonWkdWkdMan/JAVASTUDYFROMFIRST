package Prac;

public class p120924 {
    public static int solution(int[] common) {
        int answer = 0;
        int num = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
            num = common[1] - common[0];
            answer = common[common.length - 1] + num;
        } else {
            num = common[1] / common[0];
            answer = common[common.length - 1] * num;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(solution(arr));
    }

}
