package leetcode;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;

        int returnValue = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }

            if (returnValue < price[i] - minPrice) {
                returnValue = price[i] - minPrice;
            }
        }

        System.out.println(returnValue);
    }
}
