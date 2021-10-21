package codility;

public class CountDiv {
    public static void main(String[] args) {
        int A = 6;
        int B = 11;
        int K = 2;

        int returnValue = 0;
        for (int i = A; i <= B; i++) {
            if(i%K ==0){
                returnValue++;
            }
        }

        System.out.println(returnValue);
    }
}
