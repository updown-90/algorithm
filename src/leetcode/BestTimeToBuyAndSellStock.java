package leetcode;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] price = {1, 2};
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < price.length; i++) {

            int currentPrice = price[i];
            if (minPrice > currentPrice) {
                minPrice = currentPrice;
            }

            if (maxPrice < currentPrice - minPrice) {
                maxPrice = currentPrice - minPrice;
            }
        }

        System.out.println(maxPrice);
    }
}
