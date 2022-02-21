package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int money = sc.nextInt();

        int[] intArr = new int[N];

        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }

        Arrays.sort(intArr); // 뒤에 큰 동전부터 사용하려고 정렬

        int count = 0;
        // 뒤에서 부터 찾아와서 현재 가진 돈 보다 크면 그거로 나누기 계산해서 카운트 세고 금액 나머지 세팅
        for (int j = intArr.length; j != 0; j--) {
            if (money >= intArr[j - 1]) {
                count += money / intArr[j - 1];
                money = money % intArr[j - 1];
            }
        }

        System.out.println(count);


    }
}
