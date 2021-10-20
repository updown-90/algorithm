package codility;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int X = 10;
        int Y = 85;
        int D = 30;

        int returnValue = 0;
        while (X < Y) {
            X = X + D;
            returnValue++;
        }

        System.out.println(returnValue);
    }


}
