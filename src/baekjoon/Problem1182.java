package baekjoon;

import java.io.IOException;
import java.util.Scanner;

// 5 0
//-7 -3 -2 5 8
// 1
public class Problem1182 {
    public static int N, S; // 정수의 개수(n)와 부분수열이 만족하는 목표 합계(s)
    public static int[] arr; // 주어진 정수들을 저장할 배열
    public static int ans = 0; // 부분수열의 개수를 세기 위한 변수

    // 깊이 우선 탐색 함수
    public static void DFS(int i, int cnt) {
        if (i == N) { // 모든 정수를 확인한 경우
            return; // 종료
        }

        if (arr[i] + cnt == S) { // 현재 정수를 선택한 경우 부분수열의 합이 목표 합과 같으면
            ans++; // 부분수열 개수 증가
        }

        // 현재 정수를 선택하지 않은 경우와 선택한 경우를 각각 확인
        DFS(i + 1, cnt); // 현재 정수를 선택하지 않고 다음 정수로 이동


        DFS(i + 1, cnt + arr[i]); // 현재 정수를 선택하고 다음 정수로 이동
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정수의 개수 입력
        S = sc.nextInt(); // 목표 합 입력
        arr = new int[N]; // 정수를 저장할 배열 생성

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 각 정수를 배열에 저장
        }

        DFS(0, 0); // DFS 호출로 부분수열 개수를 찾음
        System.out.println(ans); // 부분수열 개수 출력
    }
}
