package live;

public class GausSum {
    public static void main(String[] args) {
        int a = 100;
        int result; // 결과물을 담을 변수

        result = (1 + a) * (a / 2); // 맨앞과 맨끝 정수의 합을 구하는 식

        if (a % 2 != 0) { // 만약 정수의 개수가 홀수라면 남은 1개의 홀수를 더하는 선택문
            result += (a + 1) / 2;
        }
        System.out.println(result);

    }
}
