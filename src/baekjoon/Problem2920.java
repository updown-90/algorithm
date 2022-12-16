package baekjoon;

import java.util.Scanner;

public class Problem2920 {

//    8개의 숫자가 주어진다 이 숫자를 보고 아래의 조건을 대입하여 출력하면 되는 문제다
//    순서대로 증가되면 ascending
//    순서대로 증감되면 descending
//    뒤죽박죽이면 mixed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 8개의 값을 배열에 담는다
        int[] inputArr = new int[8];
        for (int i = 0; i < 8; i++) {
            inputArr[i] = sc.nextInt();
        }

        boolean isAscending = true; // 초기 asc 값을 초기화한다
        boolean isDescending = true; // 초기 asc 값을 초기화한다
        for (int j = 0; j < inputArr.length - 1; j++) { // 0 ~ 7까지 배열을 돈다(8까지 돌면 +1 했을때 Exception 발생)
            if (inputArr[j] < inputArr[j + 1]) { // 현재 node의 값과 다음 node의 값을 비교해서 다음 node가 크면
                isDescending = false; // 내림차순이 아니다
            } else if (inputArr[j] > inputArr[j + 1]) { // 현재 node의 값과 다음 node의 값을 비교해서 현재 node가 크면
                isAscending = false; // 오름차순이 아니다
            }
        }

        // 위 기준값을 가지고 출력하는 로직
        if (isAscending) { // 오름차순이면
            System.out.println("ascending");
        } else if (isDescending) { // 내림차순이면
            System.out.println("descending");
        } else { // 오름차순도 내림차순도 아니면
            System.out.println("mixed");
        }
    }
}
