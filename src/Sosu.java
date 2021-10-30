import java.util.ArrayList;
import java.util.List;

public class Sosu {
    public static void main(String[] args) {
        int inputInt = 20;
        int[] intArr = new int[inputInt + 1]; // 0부터 시작하기 떄문에 숫자만큼 배열 만드려고 1+
        List<Integer> sosu = new ArrayList<>();

        for (int i = 2; i <= inputInt; i++) { // 0과 1은 제외
            if (intArr[i] == 0) {
                sosu.add(i);
                for (int j = i; j <= inputInt; j = j + i) { // i의 배수만큼 증가하면서 1로 변경해야 하므로 j = j + i
                    intArr[j] = 1;
                }
            }
        }

        for (Integer integer : sosu) {
            System.out.print(integer + ",");
        }
    }
}
