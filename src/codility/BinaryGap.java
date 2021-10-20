package codility;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public static void main(String[] args) {
        String s = Integer.toBinaryString(10);
        System.out.println("s = " + s);

        List<Integer> list = new ArrayList<>();
        int index = 1;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                list.add(index);
            }
            index++;
        }

        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int tempMax = list.get(i + 1) - list.get(i) - 1;

            if (max < tempMax) {
                max = tempMax;
            }
        }
        System.out.println(max);
    }
}
