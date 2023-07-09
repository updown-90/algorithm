package leetcode;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int removeNum = 2;

        List<Integer> returnValue = new ArrayList<>();

        for (int num : nums) {
            if (removeNum != num) {
                returnValue.add(num);
            }
        }

        for (int i = 0; i < returnValue.size(); i++) {
            nums[i] = returnValue.get(i);
        }
    }
}
