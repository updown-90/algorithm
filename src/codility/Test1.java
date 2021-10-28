package codility;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 2, 2, 1};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        boolean returnValue = true;
        for (Integer integer : map.keySet()) {
            if (map.get(integer) % 2 != 0) {
                returnValue = false;
            }
        }

        System.out.println(returnValue);
    }
}
