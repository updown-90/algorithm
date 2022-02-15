package baekjoon;

import java.util.*;


// https://www.acmicpc.net/problem/2309
public class Problem2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] totalDwarfArr = new int[9];
        boolean[] visited = new boolean[totalDwarfArr.length];

        for (int i = 0; i < 9; i++) {
            totalDwarfArr[i] = sc.nextInt();
        }

        Problem2309.combination(totalDwarfArr, visited, 0, 9, 7);
    }

    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        int result = 0;
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                result += arr[i];
                resultList.add(arr[i]);
            }
        }

        Collections.sort(resultList);

        if (result == 100) {
            for (int i : resultList) {
                System.out.println(i);
            }
            System.exit(0);
        }
    }
}
