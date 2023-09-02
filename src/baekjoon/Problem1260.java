package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1260 {

    static int[][] treeArray;   // 그래프를 나타내는 인접 행렬
    static boolean[] visited;   // 방문한 노드를 추적하는 배열
    static int N;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();   // 정점 개수
        int M = sc.nextInt();   // 간선 개수
        int V = sc.nextInt();   // 시작 정점

        treeArray = new int[N + 1][N + 1];  // 인접 행렬 초기화

        // 간선 연결 정보를 읽고 인접 행렬에 표시
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // 연결된 노드를 1로 표시
            treeArray[a][b] = 1;
            treeArray[b][a] = 1;   // 무방향 그래프이므로 양쪽 다 표시
        }

        visited = new boolean[N + 1];   // 방문한 배열 초기화

        // 깊이 우선 탐색(DFS)을 시작 정점 V에서 수행
        dfs(V);

    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.println(v);

        for (int i = 0; i <= N; i++) {
            if (!visited[i] && treeArray[v][i] == 1) {
                dfs(i);
            }
        }
    }
}


