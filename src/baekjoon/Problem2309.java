package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarfArr = new int[9];

        int sum = 0;
        for (int i = 0; i < dwarfArr.length; i++) {
            dwarfArr[i] = sc.nextInt(); // 아홉 난쟁이들을 하나씩 받아서 배열에 넣는다
            sum += dwarfArr[i]; // 아홉 난쟁이들의 총 합을 구한다
        }

        Arrays.sort(dwarfArr); // 오름차순 정렬한다

        // 아홉개의 난쟁이 배열에서 2개의 엘리먼트를 뽑고 총 합에서 그 2개의 엘리먼트를 제외한 수가 100 과 같으면 두 수만 제외하고 다 출력
        for (int i = 0; i < dwarfArr.length; i++) {
            for (int j = i + 1; j < dwarfArr.length; j++) {
                if (sum - dwarfArr[i] - dwarfArr[j] == 100) {
                    for (int i1 : dwarfArr) {
                        if (i1 != dwarfArr[i] && i1 != dwarfArr[j]) {
                            System.out.println(i1);
                        }
                    }
                    System.exit(0);
                }
            }
        }
    }
}
