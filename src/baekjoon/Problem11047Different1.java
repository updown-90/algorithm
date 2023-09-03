package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11047Different1 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tokenCount = sc.nextInt();
        int searchPrice = sc.nextInt();

        List<Integer> tokenArr = new ArrayList<>();

        for (int i = 0; i < tokenCount; i++) {
            tokenArr.add(sc.nextInt());
        }

        countToken(tokenArr, searchPrice);
        System.out.println(count);
    }

    private static void countToken(List<Integer> tokenArr, int searchPrice) {
        if (searchPrice == 0) {
            return;
        }

        int currentTokenPrice = tokenArr.get(tokenArr.size() - 1); // 현재 사용할 동전 금액
        int quotient = searchPrice / currentTokenPrice; // 금액과 동전의 몫을 구함 몫 안나오면 0으로 나옴
        count += quotient; // 몫이 곧 동전의 수 이기 때문에 sum
        tokenArr.remove(tokenArr.size() - 1);
        countToken(tokenArr, searchPrice - (currentTokenPrice * quotient));
    }
}
