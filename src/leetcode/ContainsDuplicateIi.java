package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIi {
    public static void main(String[] args) {
        int[] nums = {99,99};
        int k = 2;

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        for (int num : nums) {
            if ((map.get(num) == null || map.get(num) == 0) && num != 0) {
                count++;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(count == k);

    }
}
