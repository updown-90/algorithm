package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Problem2798 {

    // 기준 수가 주어지고 해당 N개의 수들을 주고 그 수들 중 3개의 수를 뽑아서 기준 수와 가장 가까운 수를 구하는 문제

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int cardCount = in.nextInt(); // 카드의 개수를 입력받는다
        int answer = in.nextInt(); // 기준 수를 입력받는다

        int[] cards = new int[cardCount]; // N개의 카드 를 담을 배열 선언

        // N 개의 수를 입력받아서 담는다
        for (int i = 0; i < cardCount; i++) {
            cards[i] = in.nextInt();
        }

        int result = 0; //  기준 수에 가장 가까운 수 를 담는 변수
        int temp; // 3개의 수의 합을 잠시 담을 변수
        // 순서 상관없는 모든 경우의 수를 찾는다
//        j = 5 , k = 6 , l = 7
//        j = 5 , k = 6 , l = 8
//        j = 5 , k = 6 , l = 9
//
//        j = 5 , k = 7 , l = 8
//        j = 5 , k = 7 , l = 9
//
//        j = 5 , k = 8 , l = 9
//
//        j = 6 , k = 7 , l = 8
//        j = 6 , k = 7 , l = 9
//
//        j = 6 , k = 8 , l = 9
//
//        j = 7 , k = 8 , l = 9
        for (int j = 0; j < cardCount; j++) {
            for (int k = j + 1; k < cardCount; k++) {
                for (int l = k + 1; l < cardCount; l++) {
                    temp = cards[j] + cards[k] + cards[l];
                    if (temp > result && temp <= answer) {
                        result = temp;
                    }
                }
            }
        }

        System.out.println(result);

    }
}
