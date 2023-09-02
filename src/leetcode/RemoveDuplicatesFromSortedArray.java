package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        Set<Integer> numsSet = new TreeSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        int index = 0;
        for (Integer numSet : numsSet) {
            nums[index] = numSet;
            index++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
