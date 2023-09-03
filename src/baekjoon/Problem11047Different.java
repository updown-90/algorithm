package baekjoon;

import java.util.Scanner;

public class Problem11047Different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tokenCount = sc.nextInt();
        int searchPrice = sc.nextInt();

        int[] tokenArr = new int[tokenCount];

        for (int i = 0; i < tokenCount; i++) {
            tokenArr[i] = sc.nextInt();
        }

        System.out.println(countToken(tokenArr, searchPrice));
    }

    private static int countToken(int[] tokenArr, int searchPrice) {
        int count = 0;

        for (int i = tokenArr.length - 1; i >= 0; i--) {
            int currentTokenPrice = tokenArr[i];
            int quotient = searchPrice / currentTokenPrice;
            searchPrice = searchPrice - (currentTokenPrice * quotient);
            count += quotient;
        }

        return count;
    }
}
