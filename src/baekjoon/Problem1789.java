package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1789 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언


        long inputValue = Long.parseLong(br.readLine());

        long sum = 0;
        long count = 0;

        while (sum <= inputValue) {
            sum += ++count;
        }

        System.out.println(count - 1);

    }
}


