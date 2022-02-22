package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1449 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int holeCount = sc.nextInt();
        int tapeLength = sc.nextInt();
        int[] water = new int[holeCount];
        for (int i = 0; i < holeCount; i++) {
            water[i] = sc.nextInt();
        }

        Arrays.sort(water); // 우선 정렬해서 왼쪽부터 찾아갈수 있도록 한다

        double left = water[0] - 0.5; // 첫번째 위치의 left값을 계산한다

        int cnt = 1;
        for (int i = 0; i < holeCount; i++) {
            // left+테이프의 길이의 위치보다 물이 새는곳의 위치가 더 오른쪽에 있으면 cnt를 증가시키고 left의 값을 갱신합니다.
            if (left + tapeLength < water[i]) {
                cnt++;
                left = water[i] - 0.5;
            }
        }

        System.out.println(cnt);

    }
}
