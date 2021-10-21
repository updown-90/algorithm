package codility;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};

        int zeroCnt = 0;
        int count = 0;
        for (int i : A) {
            if (i == 0) {
                zeroCnt++;
            } else if (i==1) {
                count += zeroCnt;
            }
        }

        if(count > 1000000000) {
            System.out.println(-1);
        }

        System.out.println(count);
    }
}
